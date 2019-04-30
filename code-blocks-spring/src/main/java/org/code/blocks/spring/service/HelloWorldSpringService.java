package org.code.blocks.spring.service;

import org.code.blocks.common.protocol.response.ResponseData;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
public interface HelloWorldSpringService {

    ResponseData<String> say();
}
