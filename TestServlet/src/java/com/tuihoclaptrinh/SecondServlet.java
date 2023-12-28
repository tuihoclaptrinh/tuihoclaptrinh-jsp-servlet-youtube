/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuihoclaptrinh;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 *
 * @author ACER
 */

@WebServlet(urlPatterns = "/second")
public class SecondServlet extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("SecondServlet is being initialized..............................");
        super.init();
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("SecondServlet's service..............................");
    }
    
    @Override
    public void destroy() {
        // Thực hiện các công việc cần thiết trước khi Servlet bị hủy
        System.out.println("SecondServlet is being destroyed..............................");
        super.destroy();
    }
    
}
