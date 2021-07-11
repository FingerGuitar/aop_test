package com.log_demo.demo.common;


public class Code {
    /**
     * appkey（线上）
     */
    public static final String APP_KEY_ONLINE = "zhedingweb-xvAD75RZ7261xYBRBVz";

    /**
     * secret_key(线上)
     */
    public static final String SECRET_KEY_ONLINE = "326SDHvaR3vSX8kNO0KnuN33835eaj50BKL7hq6s";

    /**
     * app_key(线下)
     */
//    public static final String APP_KEY_ONLINE = "mogo_test_App-OnCRIr3MPeymyqUz";
//
//    /**
//     * secret_key(线下)
//     */
//    public static final String SECRET_KEY_ONLINE = "d1h6bArSGnvu4PUlfUa9u49o1ecoC65F59prY8as";





    /**
     * 成功的状态
     */
    public static final Integer OK = 200;

    /**
     * 常规错误
     */
    public static final Integer FAIL = 4000;

    /**
     * 未登录
     */
    public static final Integer UN_LOGIN = 4001;

    /**
     * 不存在
     */
    public static final Integer NOT_EXIST = 4002;

    /**
     * 存在
     */
    public static final Integer EXIST = 4005;

    /**
     * 密码错误
     */
    public static final Integer PWD_NO = 4003;

    /**
     * 未绑定用户
     */
    public static final Integer UNBOUND_USER = 4004;

    /**
     * token失效
     */
    public static final Integer NO_TOKEN = 5001;


    /**
     * author_code 失效
     */
    public static final Integer NO_AUTH_CODE = 5002;

    /**
     * 查询的数据为空
     */
    public static final Integer IS_NULL = 5003;


    /**
     * 任务超时
     */
    public static final Integer TASK_TIME_OUT = 6000;


}
