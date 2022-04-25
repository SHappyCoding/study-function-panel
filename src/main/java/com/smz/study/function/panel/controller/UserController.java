package com.smz.study.function.panel.controller;

import com.smz.study.function.panel.dto.UserDTO;
import com.smz.study.function.panel.model.base.Response;
import com.smz.study.function.panel.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 19:02
 * @Description:
 */
@RestController  // 表示这是一个Controller
//@RequestMapping("/user")
@Slf4j                      // 日志打印
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Response login(String usename, String passwd) {
        Response response = new Response();
        int result = userService.login(usename, passwd);
        if (result <= 0) {
            response.failure("用户名或密码错误");
            return response;
        }
        return response;
    }

    @RequestMapping(value = "/loginTest", method = RequestMethod.GET)
    public String loginTest() {
        List<UserDTO> allUser = userService.getAllUser();
        if (CollectionUtils.isEmpty(allUser)) {
            return "没有注册用户";
        }
        UserDTO firstUser = allUser.get(0);
        log.info("{}已登录",firstUser.getUsername());
        return firstUser.getUsername();
    }
}
