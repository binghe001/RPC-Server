package com.nettyrpc.client;

/**
 * 异步回调接口
 * @author liuyazhuang
 *
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
