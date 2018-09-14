package com.learn.meta;

import java.util.Objects;

/**
 * @Author :lwy
 * @Date : 2018/9/14 15:19
 * @Description :
 */
public class Node {

    private String key;
    private String value;
    private long createReversion;
    private long modReversion;
    private long version;

    public Node() {
    }

    public Node(String key, String value, long modReversion) {
        this.key = key;
        this.value = value;
        this.modReversion = modReversion;
    }

    public Node(String key, String value, long createReversion, long modReversion, long version) {
        this.key = key;
        this.value = value;
        this.createReversion = createReversion;
        this.modReversion = modReversion;
        this.version = version;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getCreateReversion() {
        return createReversion;
    }

    public void setCreateReversion(long createReversion) {
        this.createReversion = createReversion;
    }

    public long getModReversion() {
        return modReversion;
    }

    public void setModReversion(long modReversion) {
        this.modReversion = modReversion;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return createReversion == node.createReversion &&
                modReversion == node.modReversion &&
                version == node.version &&
                Objects.equals(key, node.key) &&
                Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(key, value, createReversion, modReversion, version);
    }

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", createReversion=" + createReversion +
                ", modReversion=" + modReversion +
                ", version=" + version +
                '}';
    }
}
