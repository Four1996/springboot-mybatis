package com.ph.springbootmybatis.mapper;
/**
 * @program: springboot-profiles
 * @description:
 * @author: panhao
 * @date: 2021-06-26 19:55
 **/

import com.ph.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from t_user")
    public List<User> findAll();
}
