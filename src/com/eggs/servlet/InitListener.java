package com.eggs.servlet;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.eggs.domain.BaseMenuRepository;

/**
 * Application Lifecycle Listener implementation class InitListener
 *
 */
public class InitListener implements ServletContextListener {

    public InitListener() {
        
    }

    public void contextInitialized(ServletContextEvent ctxEvent) {
        ServletContext ctx = ctxEvent.getServletContext();

        ctx.setAttribute("menuRepo", new BaseMenuRepository());
        ctx.setAttribute("userList", new ArrayList<String>());
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // Ignore
    }
	
}
