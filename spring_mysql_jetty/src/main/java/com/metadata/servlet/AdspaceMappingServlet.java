package com.metadata.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by miaohaifeng
 * on 2016/3/3.
 */
public class AdspaceMappingServlet extends BaseServlet {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("P3P", "CP='IDC DSP COR ADM DEVi TAIi PSA PSD IVAi IVDi CONi HIS OUR IND CNT'");
        response.setStatus(HttpServletResponse.SC_OK);
        String jsonString = "[]";
        logger.info("==========================开始调用 AdspaceMappingServlet====================");
        try {
            jsonString = "";
            while ("[]".equals(jsonString)) {
                Thread.sleep(2000);
                logger.error("调用AdspaceMappingServlet 出现异常}");
            }
        } catch (Exception e) {
            logger.info("调用AdspaceMappingServlet 出错:{}{}", new Object[]{e.getStackTrace(), e.getMessage()});
            logger.error("调用AdspaceMappingServlet 出错:{}{}", new Object[]{e.getStackTrace(), e.getMessage()});
        } finally {
            response.getWriter().println(jsonString);
        }
        logger.info("==========================结束调用AdspaceMappingServlet====================");

    }
}
