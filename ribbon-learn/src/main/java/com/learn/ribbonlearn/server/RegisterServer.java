package com.learn.ribbonlearn.server;

import com.netflix.loadbalancer.Server;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:21
 * @Description :
 */
public class RegisterServer extends Server {

    private String host;
    private int port;

    public RegisterServer(String host, int port) {
        super(host, port);
        this.host = host;
        this.port = port;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }
}
