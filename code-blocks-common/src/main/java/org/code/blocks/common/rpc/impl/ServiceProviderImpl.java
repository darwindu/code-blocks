package org.code.blocks.common.rpc.impl;


import org.code.blocks.common.rpc.ServiceProvider;

/**
 * 服务提供者接口实现
 * @author darwindu
 * @date 2019/3/29
 **/
public class ServiceProviderImpl implements ServiceProvider {

    @Override
    public String say(String name) {

        return new StringBuffer("hi,").append(name).toString();
    }
}
