package com.metadata.servlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServlet;

/**
 * Created by miaohaifeng
 * on 2016/3/3.
 */
public class BaseServlet extends HttpServlet {

    private ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});

}
