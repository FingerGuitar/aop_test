package com.log_demo.demo.common;

import lombok.Data;

/**
 * @author 柳鹏飞
 * @version 1.0
 * @date 2020/11/4 8:49
 */
@Data
public class AjaxObject {
    private Integer code;
    private String msg;
    private Object data;
    private Object sut;
    private Object pox;


    public static AjaxObject setR(int code, String msg, Object data, Object sut, Object pox){
        AjaxObject ajaxObject =new AjaxObject();
        ajaxObject.setCode(code);
        ajaxObject.setMsg(msg);
        ajaxObject.setData(data);
        ajaxObject.setPox(pox);
        ajaxObject.setSut(sut);

        return ajaxObject;
    }
    //成功
    public AjaxObject ok(){
        return setR(200,"OK",null,null,null);
    }
    public static AjaxObject ok(Object data){
        return setR(200,"OK",data,null,null);
    }
    public static AjaxObject count(Object sut){
        return setR(200,"OK",sut,null,null);
    }
    //失败
    public static AjaxObject fail(){
        return setR(Code.FAIL,"Fail",null,null,null);
    }
    public static AjaxObject fail(String msg){
        return setR(Code.FAIL,msg,null,null,null);
    }
    public static AjaxObject Null(){
        return setR(Code.IS_NULL,"数据为空",null,null,null);
    }
    public static AjaxObject Null(String msg){
        return setR(Code.IS_NULL,msg,null,null,null);
    }

    public static AjaxObject out(){
        return setR(403,"Fail",null,null,null);
    }
    public static AjaxObject out(String msg){
        return setR(403,msg,null,null,null);
    }

    public static AjaxObject jd(){
        return setR(4001,"Fail",null,null,null);
    }
    public static AjaxObject jd(String msg){
        return setR(403,msg,null,null,null);
    }
    public static AjaxObject jd(Object data){
        return setR(200,"OK",data,null,null);
    }

    public Integer getCode() {
        return code;
    }

    public void setStatusCode(Integer Code) {
        this.code = Code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getSut() {
        return sut;
    }

    public void setSut(Object sut) {
        this.sut = sut;
    }

    public Object getPox() {
        return pox;
    }

    public void setPox(Object pox) {
        this.pox = pox;
    }
}
