package com.learn.mesh.commons;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Author :lwy
 * @Date : 2018/9/20 18:15
 * @Description :
 */
public class ConnInitializer {


    /**
     * zookeeper创建连接
     * @param hostName
     * @param timeOut
     * @return
     * @throws InterruptedException
     * @throws IOException
     */
    public static ZooKeeper ZKConnect(String hostName, int timeOut) throws InterruptedException, IOException {
        CountDownLatch latch = new CountDownLatch(1);
        ZooKeeper zooKeeper = new ZooKeeper(hostName, timeOut, eventStat -> {
            if (eventStat.getState() == Watcher.Event.KeeperState.SyncConnected) {
                latch.countDown();
            }
        });
        latch.await();
        return zooKeeper;
    }
}
