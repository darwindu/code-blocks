package org.code.blocks.springboot.jdbc.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springboot.jdbc.dao.GirlDao;
import org.code.blocks.springboot.jdbc.protocol.entity.Girl;
import org.code.blocks.springboot.jdbc.protocol.vo.GirlVo;
import org.code.blocks.springboot.jdbc.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author darwindu
 * @date 2020/12/29
 **/
@Service
@Slf4j
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlDao girlDao;

    @Override
    public ResponseData<Boolean> save(GirlVo girlVo) {

        Girl girl = new Girl();
        girl.setAge(girlVo.getAge());
        girl.setCupSize(girlVo.getCupSize());
        int index = girlDao.save(girl);
        log.info("save success, process index: {}", index);
        return ResponseData.success(true);
    }

    @Override
    public ResponseData<Boolean> delete(int id) {

        int index = girlDao.delete(id);
        log.info("delete success, process index: {}", index);
        return ResponseData.success(true);
    }

    @Override
    public ResponseData<Girl> getGirlById(int id) {
        return ResponseData.success(girlDao.getGirlById(id));
    }
}
