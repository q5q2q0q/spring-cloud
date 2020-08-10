package com.fh.common;

public enum ResponseEnum {
    CART_DELETE_BATCH_IDS_IS_NULL(3003, "批量删除的ids为空"),
    CART_NUM_IS_ERROR(3002,"添加的商品数量不合法"),
    CART_PRODUCT_IS_DOWN(3001,"添加的商品已下架"),
    CART_PRODUCT_IS_NULL(3000,"添加的商品不存在"),
    HEADER_IS_MISS(6000, "头信息丢失"),
    HEADER_CONTENT_IS_MISS(6001, "头信息的内容不完整"),
    DATA_IS_CHANGE(6002, "数据被篡改了"),
    LOGIN_IS_TIMEOUT(6003, "登录超时"),
    LOGIN_MEMBER_IS_EMPTY(9000, "登录时会员名或者密码不能为空"),
    LOGIN_MEMBER_NAME_IS_ERROR(9001, "登录时会员名错误"),
    LOGIN_MEMBER_PASSWORD_IS_ERROR(9002, "登录时密码错误"),
    MEMBER_INFO_IS_EMPTY(8000, "会员注册信息不能有空"),
    MEMBER_NAME_IS_EXIST(8001, "会员名已被注册"),
    PHONE_IS_EXIST(8002, "手机号已被注册"),
    MAIL_IS_EXIST(8003, "邮箱已被注册"),
    MEMBER_NAME_IS_NULL(8004, "会员名为空"),
    MAIL_IS_NULL(8005, "邮箱为空"),
    PHONE_IS_NULL(8006, "电话为空"),
    QUERY_PARAM_IS_EMPTY(6000, "查询信息条件不完整"),
    PARAM_IS_EMPTY(5000, "参数信息不完整"),
    REG_PHONE_IS_EXIST(1004,"手机号码已存在"),
    REG_MAIL_IS_EXIST(1003,"邮箱已存在"),
    SIGN_UP_SUCCEEDED(200,"注册成功");





    private int code;

    private String msg;

    private ResponseEnum(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
