package org.code.blocks.common.service;

import org.code.blocks.common.protocol.response.ResponseData;

/**
 * @author darwindu
 * @date 2019/4/29
 **/
public interface HelloWorldService {

    ResponseData<String> say();
}
