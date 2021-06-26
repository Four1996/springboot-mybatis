package com.ph.springbootmybatis.mapper;/**
 * @program: springboot-profiles
 * @description:
 * @author: panhao
 * @date: 2021-06-26 20:04
 **/

import com.ph.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserXmlMapper {
    public List<User> findAll();
}
