package com.devin.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //1.执行Action之前
        long start = System.currentTimeMillis();
        //2.执行下一个拦截器，如果已经是最后一个拦截器，则执行目标action
        String result = actionInvocation.invoke();//表示调用下一个拦截器，如果已经是最后一个拦截器，则执行目标action
        //3.执行Action之后，再次统计时间
        long end  = System.currentTimeMillis();
        System.out.println("执行时间"+(end-start)+"ms");

        return result;
    }
}
