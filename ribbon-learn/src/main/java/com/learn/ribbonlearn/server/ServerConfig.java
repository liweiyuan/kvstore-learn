package com.learn.ribbonlearn.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:21
 * @Description :
 */
@Configuration
public class ServerConfig {


    //@Bean
    public ServerList newInstance() {
        List<RegisterServer> servers = new ArrayList<>();
        RegisterServer server = new RegisterServer("1.2.3.4", 1234);
        RegisterServer server1 = new RegisterServer("5.6.7.8", 5678);

        servers.add(server);
        servers.add(server1);
        return ServerList.newBuilder()
                .withServerList(servers)
                .build();
    }

}
