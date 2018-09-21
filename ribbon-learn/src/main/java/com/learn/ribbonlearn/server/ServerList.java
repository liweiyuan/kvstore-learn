package com.learn.ribbonlearn.server;

import java.util.List;

/**
 * @Author :lwy
 * @Date : 2018/9/21 10:30
 * @Description :
 */
public class ServerList {

    private List<RegisterServer> serverList;

    public List<RegisterServer> getServerList() {
        return serverList;
    }

    public void setServerList(List<RegisterServer> serverList) {
        this.serverList = serverList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private List<RegisterServer> serverList;

        private Builder() {
        }


        public Builder withServerList(List<RegisterServer> serverList) {
            this.serverList = serverList;
            return this;
        }

        public ServerList build() {
            ServerList serverList = new ServerList();
            serverList.setServerList(this.serverList);
            return serverList;
        }
    }
}
