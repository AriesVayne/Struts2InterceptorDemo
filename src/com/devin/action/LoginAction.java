package com.devin.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {
    private String username;
    private String password;
    private Map<String,Object> session;
    @Override
    public String execute() throws Exception {
            return SUCCESS;
    }
    @Override
    public void setSession(Map<String, Object> session) {
        this.session  = session;
    }
    public String login(){
        if("admin".equals(username)&&"123".equals(password)){
            session.put("userinfo",username);
            return SUCCESS;
        }else{
            session.put("loginError","用户名或密码不正确");
            return ERROR;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
