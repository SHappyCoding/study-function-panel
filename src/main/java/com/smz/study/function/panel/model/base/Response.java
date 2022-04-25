package com.smz.study.function.panel.model.base;

/**
 * @Author: smz
 * @Date: Created in 2022/4/23 19:19
 * @Description: http response
 */
public class Response {
    // 成功文案
    private static final String OK_MSG = "ok";
    // 成功状态码
    private static final int SUCCESS_CODE = 200;
    // 失败文案
    private static final String ERROR_MSG = "error";
    // 失败状态码
    private static final int ERROR_CODE = 500;
    // 状态码字段
    private int code;
    // 返回数据
    private Object data;
    // 返回文案
    private String message;

    public Response success() {
        code = SUCCESS_CODE;
        message = OK_MSG;
        return this;
    }

    public Response success(Object data) {
        return success(data, OK_MSG);
    }

    public Response success(Object data, String message) {
        this.code = SUCCESS_CODE;
        this.data = data;
        this.message = message;
        return this;
    }

    public Response failure() {
        code = ERROR_CODE;
        message = ERROR_MSG;
        return this;
    }

    public Response failure(String message) {
        code = ERROR_CODE;
        message = message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

}
