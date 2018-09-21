package com.learn.ribbonlearn.server;

import com.netflix.loadbalancer.ServerList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:59
 * @Description :
 */
public class RegisteredServerDynamicList implements ServerList<RegisterServer> {
    private static List<RegisterServer> servers = new ArrayList<>();

    @Override
    public List<RegisterServer> getInitialListOfServers() {
        return servers;
    }

    @Override
    public List<RegisterServer> getUpdatedListOfServers() {

        //TODO 去重，心跳，刷新机制

        //TODO 根据去zk etcd获取服务器结果
        RegisterServer server = new RegisterServer("11.11.11.11", 9999);
        RegisterServer server1 = new RegisterServer("22.22.22.22", 8888);

        servers.add(server);
        servers.add(server1);
        return servers;
    }
}
