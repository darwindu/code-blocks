package org.code.blocks.common.rpc;

/**
 * 服务中心接口
 * @author darwindu
 * @date 2019/3/29
 **/
public interface ServiceCenter {

    void stop();

    void start();

    void register(Class serviceInterface, Class impl);

    boolean isRunning();

    int getPort();
}
