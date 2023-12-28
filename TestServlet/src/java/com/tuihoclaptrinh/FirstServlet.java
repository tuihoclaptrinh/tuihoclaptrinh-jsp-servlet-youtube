package com.tuihoclaptrinh;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class FirstServlet implements Servlet {

    // Life cycle methods:
    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Initial Servlet......................");
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servicing......................");
    }

    @Override
    public void destroy() {
        System.out.println("Detroying......................");
    }
    
    // Non-life cycle methods:
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }
    
    @Override
    public String getServletInfo() {
        return "This servlet is created by Tuihoclaptrinh";
    }

    
    
}
