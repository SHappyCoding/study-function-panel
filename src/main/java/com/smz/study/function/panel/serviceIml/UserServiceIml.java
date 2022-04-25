package com.smz.study.function.panel.serviceIml;

import com.smz.study.function.panel.controller.UserController;
import com.smz.study.function.panel.dao.UserDao;
import com.smz.study.function.panel.dto.UserDTO;
import com.smz.study.function.panel.service.UserService;
import com.smz.study.function.panel.util.ConvertDTOUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 18:57
 * @Description:
 */
@Service("userService")  // Service层注入bean，把实现类交给spring处理。
public class UserServiceIml implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceIml.class);

    @Autowired
    private UserDao userDao;

    @Override
    public int login(String username, String passwd) {
        if(username == null || passwd == null){
            return 0;
        }
        return userDao.login(username,passwd);
    }

    @Override
    public List<UserDTO> getAllUser() {
        return ConvertDTOUtils.UserEntity2DTO(userDao.queryAllUser());
    }

}
