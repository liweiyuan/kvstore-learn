package com.learn.mesh;

import com.learn.mesh.annonation.KVStoreServer;
import com.learn.mesh.model.Application;

/**
 * @Author :lwy
 * @Date : 2018/9/20 18:35
 * @Description :
 */
@KVStoreServer
public class KVStoreServerTest {

    public static void main(String[] args) {

        Object obj=new KVStoreServerTest();

        Application application=new Application("test-model",9091);


    }
}
