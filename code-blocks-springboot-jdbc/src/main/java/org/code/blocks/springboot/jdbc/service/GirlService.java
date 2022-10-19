package org.code.blocks.springboot.jdbc.service;

import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springboot.jdbc.protocol.entity.Girl;
import org.code.blocks.springboot.jdbc.protocol.vo.GirlVo;

/**
 * @author darwindu
 * @date 2020/12/29
 **/
public interface GirlService {

    ResponseData<Boolean> save(GirlVo girlVo);

    ResponseData<Boolean> delete(int id);

    ResponseData<Girl> getGirlById(int id);
}
