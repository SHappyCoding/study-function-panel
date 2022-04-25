package com.smz.study.function.panel.dao;

import com.smz.study.function.panel.Base.JunitTest;
import com.smz.study.function.panel.dao.entity.UserEntity;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/24 09:24
 * @Description:
 */
@SpringBootTest
public class UserDaoUT extends JunitTest {

    @Autowired
    private UserDao userDao;

    @Test
    private void queryAllUserUT() {
        List<UserEntity> allUser = new ArrayList<>();
        allUser = userDao.queryAllUser();
        Assert.assertTrue(CollectionUtils.isNotEmpty(allUser));
        UserEntity firstUser = allUser.get(0);
        System.out.println(firstUser.getUsername());
    }


}
