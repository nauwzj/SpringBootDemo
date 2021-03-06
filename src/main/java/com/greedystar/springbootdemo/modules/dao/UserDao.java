package com.greedystar.springbootdemo.modules.dao;

import com.greedystar.springbootdemo.common.BaseDao;
import com.greedystar.springbootdemo.modules.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2018-07-11
 */
@Mapper
public interface UserDao extends BaseDao<User> {

    List<User> findUserList(User user);

    User getByUsername(String username);

}