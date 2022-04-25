package com.smz.study.function.panel.dao.entity;

import java.util.Date;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 18:19
 * @Description:
 */
public class UserEntity {
    private int id;
    private String username;    // 用户名
    private String passwd;      // 明文密码
    private Date addTime;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public Date getAddTime() {
        return addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
