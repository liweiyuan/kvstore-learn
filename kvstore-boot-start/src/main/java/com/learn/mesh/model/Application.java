package com.learn.mesh.model;

/**
 * @Author :lwy
 * @Date : 2018/9/20 18:33
 * @Description :
 */
public class Application {

    private String name;
    private Integer port;

    public Application(String name, Integer port) {
        this.name = name;
        this.port = port;
    }

    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
