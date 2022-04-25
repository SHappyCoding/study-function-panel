package com.smz.study.function.panel.service;

import com.smz.study.function.panel.dto.UserDTO;

import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 18:22
 * @Description:
 */
public interface UserService {

    int login(String username,String passwd);

    List<UserDTO> getAllUser();
}
