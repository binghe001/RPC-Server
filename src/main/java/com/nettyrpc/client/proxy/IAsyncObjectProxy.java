package com.nettyrpc.client.proxy;

import com.nettyrpc.client.RPCFuture;

/**
 * 异步对象代理接口
 * @author liuyazhuang
 *
 */
public interface IAsyncObjectProxy {
    /**
     * 异步代理对象回调方法
     * @param funcName
     * @param args
     * @return
     */
    public RPCFuture call(String funcName, Object... args);
}