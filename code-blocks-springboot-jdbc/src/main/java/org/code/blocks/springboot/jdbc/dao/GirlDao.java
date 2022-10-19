package org.code.blocks.springboot.jdbc.dao;

import org.apache.ibatis.annotations.Param;
import org.code.blocks.springboot.jdbc.protocol.entity.Girl;
import org.springframework.stereotype.Repository;

/**
 * @author darwindu
 * @date 2022/10/19
 **/
@Repository
public interface GirlDao {

    int delete(int id);

    Girl getGirlById(int id);

    int save(@Param("girl")Girl girl);

    int updateById(@Param("id") int id, @Param("cupSize") String cupSize);
}
