package org.code.blocks.designpattern.struct.filter;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口。
 * @author darwindu
 * @date 2019/12/10
 **/
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
