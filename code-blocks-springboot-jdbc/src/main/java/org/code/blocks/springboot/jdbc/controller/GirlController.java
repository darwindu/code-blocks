package org.code.blocks.springboot.jdbc.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;
import org.code.blocks.common.protocol.response.ResponseData;
import org.code.blocks.springboot.jdbc.protocol.entity.Girl;
import org.code.blocks.springboot.jdbc.protocol.vo.GirlIdVo;
import org.code.blocks.springboot.jdbc.protocol.vo.GirlVo;
import org.code.blocks.springboot.jdbc.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author darwindu
 * @date 2020/12/29
 **/
@Controller
@Slf4j
@RequestMapping(value = "girl")
public class GirlController {

    @Autowired
    @Qualifier("girlServiceImpl")
    private GirlService girlService;

    @RequestMapping("hi")
    @ResponseBody
    public ResponseData<Boolean> yes() {
        return ResponseData.success(true);
    }

    @RequestMapping("getGirlById")
    @ResponseBody
    public ResponseData<Girl> getGirlById(@RequestBody @Valid GirlIdVo girlIdVo) {
        return girlService.getGirlById(girlIdVo.getId());
    }

    @RequestMapping("save")
    @ResponseBody
    public ResponseData<Boolean> save(@RequestBody @Valid GirlVo girlVo) {
        return girlService.save(girlVo);
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResponseData<Boolean> delete(@RequestBody @Valid GirlIdVo girlIdVo) {
        return girlService.delete(girlIdVo.getId());
    }

}
