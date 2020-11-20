package org.code.blocks.springboot.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author darwindu
 * @date 2020/7/9
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void springDataSourceTest(){
        //输出为true
        System.out.println(dataSource instanceof HikariDataSource);
        try{
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from girl");
            Girl girl = null;
            if(resultSet.next()){
                girl = new Girl();
                girl.setId(resultSet.getInt("id"));
                girl.setCupSize(resultSet.getString("cup_size"));
                girl.setAge(resultSet.getInt("age"));
            }
            System.out.println(girl);
            statement.close();
            connection.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}
