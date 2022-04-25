package com.smz.study.function.panel.dto;

import java.util.Date;

/**
 * @Author: smz
 * @Date: Created in 2022/4/24 08:15
 * @Description:
 */
public class UserDTO {
    private String username;    // 用户名
    private String passwd;      // 明文密码
    private Date addTime;
    private Date updateTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
