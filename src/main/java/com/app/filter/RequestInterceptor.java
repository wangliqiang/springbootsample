package com.app.filter;

import com.app.bean.Users;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by 王立强 on 2017/5/19.
 */
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        boolean flag =true;
        String ip = httpServletRequest.getRemoteAddr();
        long startTime = System.currentTimeMillis();
        httpServletRequest.setAttribute("requestStartTime", startTime);
        HandlerMethod handlerMethod = (HandlerMethod) o;
        Method method = handlerMethod.getMethod();
        System.out.println("用户:"+ip+",访问目标:"+method.getDeclaringClass().getName() + "." + method.getName());

//        Users user=(Users)httpServletRequest.getSession().getAttribute("user");
//        if(null==user){
//            httpServletResponse.sendRedirect("hello");
//            flag = false;
//        }else{
//            flag = true;
//        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) o;
        Method method = handlerMethod.getMethod();
        long startTime = (Long) httpServletRequest.getAttribute("requestStartTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        // 打印方法执行时间
        if (executeTime > 1000) {
            System.out.println("[" + method.getDeclaringClass().getName() + "." + method.getName() + "] 执行耗时 : "
                    + executeTime + "ms");
        } else {
            System.out.println("[" + method.getDeclaringClass().getSimpleName() + "." + method.getName() + "] 执行耗时 : "
                    + executeTime + "ms");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
