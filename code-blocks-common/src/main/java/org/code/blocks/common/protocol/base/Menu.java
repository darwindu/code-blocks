package org.code.blocks.common.protocol.base;

import lombok.Data;

/**
 * 资源分类对象结构
 * @author darwindu
 * @date 2019/4/1
 **/
@Data
public class Menu {

    private Integer id;
    private String menuName;
    private Integer parentId;
    private Integer typeLevel;
    private Integer sort;
    private String createdDt;
    private String createdUserId;
    private String updatedDt;
    private String updatedUserId;

}
