package com.smz.study.function.panel.dao;

import com.smz.study.function.panel.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 18:18
 * @Description:
 */
@Mapper
@Repository("userDao")  // Dao层注入bean，把实现类交给spring处理。
public interface UserDao {
    int login(String username,String passwd);

    List<UserEntity> queryAllUser();
}