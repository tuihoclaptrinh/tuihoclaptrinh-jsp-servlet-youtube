package com.tuihoclaptrinh;


import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class FirstServlet implements Servlet {

    ServletConfig config;
    // life circle:
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Init Frist Servlet.....................");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service First Servlet starting.....................");

    }
    @Override
    public void destroy() {
        System.out.println("First Servlet detroying.....................");
    }

    // non life circle:
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
    @Override
    public String getServletInfo() {
        return "This servlet is created by tuihoclaptrinh";
    }

    
    
}
