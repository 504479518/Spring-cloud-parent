package com.caesar.admin.listener;

import cn.hutool.json.JSONUtil;
import com.caesar.admin.service.ISysMenuService;
import com.caesar.admin.service.ISysOauthClientService;
import com.caesar.admin.service.ISysPermissionService;
import com.caesar.common.domain.CanalMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author caesar
 * @desc Canal + RabbitMQ 监听数据库数据变化
 * @email 504479518@qq.com
 * @date 2021/12/2
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class CanalListener {

    private final ISysPermissionService permissionService;
    private final ISysOauthClientService oauthClientService;
    private final ISysMenuService menuService;

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue(value = "canal.queue", durable = "true"),
                    exchange = @Exchange(value = "canal.exchange"),
                    key = "canal.routing.key"
            )
    })
    public void handleDataChange(String message) {
        CanalMessage canalMessage = JSONUtil.toBean(message, CanalMessage.class);
        String tableName = canalMessage.getTable();

        log.info("Canal 监听 {} 发生变化；明细：{}", tableName, message);

        if ("sys_oauth_client".equals(tableName)) {
            log.info("======== 清除客户端信息缓存 ========");
            oauthClientService.cleanCache();
        } else if (Arrays.asList("sys_permission", "sys_role", "sys_role_permission").contains(tableName)) {
            log.info("======== 刷新角色权限缓存 ========");
            permissionService.refreshPermRolesRules();
        } else if (Arrays.asList("sys_menu", "sys_role", "sys_role_menu").contains(tableName)) {
            log.info("======== 清理菜单路由缓存 ========");
            menuService.cleanCache();
        }
    }
}
