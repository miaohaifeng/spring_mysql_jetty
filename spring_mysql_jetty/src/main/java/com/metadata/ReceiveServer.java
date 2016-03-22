package com.metadata;

import com.metadata.servlet.AdspaceMappingServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.util.thread.QueuedThreadPool;

/**
 * Created by sky-wind on 2016/2/23.
 */

public class ReceiveServer {

    public static void main(String[] args) throws Exception {

        Server server = new Server();
        // HttpServer httpServer =  new HttpServer();
        QueuedThreadPool threadPool = new QueuedThreadPool();
        threadPool.setMinThreads(10);
        threadPool.setMaxThreads(5000);
        server.setThreadPool(threadPool);
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(5555);
        // 每个请求被accept前允许等待的连接数
        connector.setAcceptQueueSize(500);
        // 同事监听read事件的线程数
        connector.setAcceptors(30);
        // 连接最大空闲时间，默认是200000，-1表示一直连接
        connector.setMaxIdleTime(3000);
        server.addConnector(connector);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(AdspaceMappingServlet.class, "/loadAddCampaignServlet");


        server.start();
        server.join();
    }

}