package com.nettyrpc.registry;

/**
 * Zookeeper相关的常量类
 * @author liuyazhuang
 *
 */
public interface Constant {

    int ZK_SESSION_TIMEOUT = 5000;

    String ZK_REGISTRY_PATH = "/registry";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
