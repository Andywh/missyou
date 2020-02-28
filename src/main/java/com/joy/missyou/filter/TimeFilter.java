//package com.joy.missyou.filter;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.util.Date;
//
///**
// * Created by SongLiang on 2019-12-20
// */
////@Component
//public class TimeFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("init");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        System.out.println("do Filter start");
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        System.out.println(req.getRequestURL());
//        long start = new Date().getTime();
//        filterChain.doFilter(servletRequest, servletResponse);
//        System.out.println("time filter: " + (new Date().getTime() - start) + "ms");
//        System.out.println("do Filter finish");
//
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destroy");
//    }
//}
