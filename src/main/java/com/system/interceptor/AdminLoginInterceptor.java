package com.system.interceptor;

import com.system.model.Admin;
import com.system.model.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Admin admin=(Admin) request.getSession().getAttribute("login_admin");
        if(admin!=null) {
            return true;
        }
        request.setAttribute("error_msg","请先登录管理员账户");
        request.getRequestDispatcher("/WEB-INF/views/admin/error.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

//    public void setPassList(List passList) {
//    }
//
//    public List<String> getPassList() {
//        return passList;
//    }
}
