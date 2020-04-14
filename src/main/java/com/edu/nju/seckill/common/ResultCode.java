package com.edu.nju.seckill.common;

/**
 * 枚举了一些常用API操作码
 *
 * @author macro
 * @date 2019/4/19
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限"),
    HAS_EXIST(405,"该号码已经被注册"),
    DATABASE_ERROR(406,"数据库异常"),
    /**
     * 1000 - 1999 参数相关错误
     */
    BINDING_ARGS_ERROR(1002, "参数格式错误");


    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
