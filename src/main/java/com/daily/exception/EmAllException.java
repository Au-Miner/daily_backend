package com.daily.exception;

/*
 * @Author:
 * @Date:2022/1/30
 * @Description:
 */
public enum EmAllException implements CommonError{
    NO_LOGIN_AUTHORIZATION(403, "没有登录权限"),
    NO_SUCH_USER(403, "用户不存在"),
    NO_SUCH_GROUP(403, "小组不存在"),
    BAD_REQUEST(400, "请求参数格式有误"),
    UNKNOWN_ERROR(500,"未知错误"),
    TOKEN_ERROR(403,"TOKEN错误"),
    NOT_AUTHORIZED(403,"无权限")
    ;

    // 错误码
    private Integer code;

    // 错误信息
    private String msg;

    EmAllException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getErrCode() {
        return this.code;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.msg = errMsg;
        return this;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
