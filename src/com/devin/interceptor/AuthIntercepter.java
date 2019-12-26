package com.devin.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class AuthIntercepter extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ActionContext context = ActionContext.getContext();
        Map<String,Object> session = context.getSession();
        if(session.get("userinfo") != null){
            String result = actionInvocation.invoke();
            return result;
        }else{
            return "login";
        }
    }
}
