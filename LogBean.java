package com.hfl.log2;

public class LogBean {
    //客户端的ip地址
    private String addr;
    //客户端的用户名，属性忽略“-”
    private String user;
    //用户访问的时间
    private String time;
    //用户的url与http协议
    private String request;
    //是否访问成功的状态码：大于等于400失败
    private String status;
    //发送给客户端文件的大小
    private String size;
    //记录用户从哪个网页访问的
    private String referer;
    //记录客户端浏览器的信息
    private String user_agent;

    private boolean valid = true;// 判断数据是否合法

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\001").append(addr)
         .append("\001").append(user)
         .append("\001").append(time)
         .append("\001").append(request)
         .append("\001").append(status)
         .append("\001").append(size)
         .append("\001").append(referer)
         .append("\001").append(user_agent);

        return s.toString();
    }
}
