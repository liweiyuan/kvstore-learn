package com.learn.ribbonlearn.service;

import com.alibaba.fastjson.JSONObject;
import com.learn.ribbonlearn.server.RegisterServer;
import com.learn.ribbonlearn.server.RegisteredServerDynamicList;
import com.learn.ribbonlearn.server.ServerList;
import com.netflix.client.IClient;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:41
 * @Description :
 */
@Service
public class ServerListService {

    RegisteredServerDynamicList registeredServerDynamicList = new RegisteredServerDynamicList();
    //@Autowired
    private ServerList serverList;

    public String getAllServerList() {
        return JSONObject.toJSONString(serverList.getServerList());
    }

    //获取其中的一个

    public String getOneServer() {


        IClientConfig clientConfig = new DefaultClientConfigImpl();

        ILoadBalancer loadBalancer = LoadBalancerBuilder.<RegisterServer>newBuilder()
                .withClientConfig(clientConfig)
                .withDynamicServerList(registeredServerDynamicList)
                .withRule(new RandomRule())
                .buildDynamicServerListLoadBalancer();

        Server server = loadBalancer.chooseServer("");
        return server.getHost();
    }
}
