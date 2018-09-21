package com.learn.mesh;

import com.learn.mesh.commons.ConnInitializer;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author :lwy
 * @Date : 2018/9/20 18:25
 * @Description :
 */
public class ConnInitializerTest {

    @Test
    public void testZkConn() throws IOException, InterruptedException {
        ZooKeeper zooKeeper= ConnInitializer.ZKConnect("192.168.30.121:2181",2000);
        System.err.println(zooKeeper);
    }
}
