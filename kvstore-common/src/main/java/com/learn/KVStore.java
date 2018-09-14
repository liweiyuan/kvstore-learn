package com.learn;

import com.learn.meta.Node;

/**
 * @Author :lwy
 * @Date : 2018/9/14 15:21
 * @Description :
 */
public interface KVStore extends AutoCloseable{
    Node get(String key) throws Exception;
    long put(String key, String value) throws Exception;
    long put(String key, String value, boolean ephemeral) throws Exception;
    void createParentNode(String parentNode) throws Exception;
}
