/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuihoclaptrinh;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class SecondServlet extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init Second Servlet.....................");
        super.init();
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service Second Servlet starting.....................");

    }
    @Override
    public void destroy() {
        System.out.println("Second Servlet detroying.....................");
        super.destroy();
    }
    
}
