package com.system.interceptor;

import com.system.model.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class StudentLoginInterceptor extends HandlerInterceptorAdapter {
//    private List<String> passList=new ArrayList<String>();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //允许放行的url路径
//        String url=request.getRequestURI();
//        System.out.println("url-->"+url);
//        for(String passUrl:passList) {
//            System.out.println("passUrl-->"+passUrl);
//            if(url.indexOf(passUrl)>0) {
//                return true;
//            }
//        }
        //已经登录放行
        Student student=(Student)request.getSession().getAttribute("login_student");
        if(student!=null) {
            return true;
        }
        request.setAttribute("error_msg","请先登录");
        request.getRequestDispatcher("/WEB-INF/views/student/error.jsp").forward(request, response);
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
