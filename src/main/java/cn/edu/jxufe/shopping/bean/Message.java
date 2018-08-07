package cn.edu.jxufe.shopping.bean;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-07 12:03:10
 * @Description gitee:www.gitee.com/cgggitee/
 * github:https://github.com/love390/
 */
public class Message {
    private Integer code;//消息状态码
    private String msg;//消息描述

    public Message() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
