package com.ph.springbootmybatis;

import com.ph.springbootmybatis.domain.User;
import com.ph.springbootmybatis.mapper.UserMapper;
import com.ph.springbootmybatis.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserXmlMapper userXmlMapper;


    @Test
    public void testFindAll2() {
        List<User> all = userXmlMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
    @Test
    public void testFindAll() {
        List<User> all = userMapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
