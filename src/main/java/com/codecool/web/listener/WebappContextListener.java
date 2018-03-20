package com.codecool.web.listener;

import com.codecool.web.model.Message;
import com.codecool.web.service.MessageService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

@WebListener
public final class WebappContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext cntxt = sce.getServletContext();
        MessageService messageService = new MessageService();
        List<Message> message = messageService.getData();

        cntxt.setAttribute("data", message);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("This method is invoked once when the webapp gets undeployed.");
    }
}
