/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.tuihoclaptrinh;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "ThirdServlet", urlPatterns = {"/thrid"})
public class ThirdServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("ThridServlet is being initialized..............................");
        super.init();
    }
    
    @Override
    public void destroy() {
        // Thực hiện các công việc cần thiết trước khi Servlet bị hủy
        System.out.println("ThridServlet is being destroyed..............................");
        super.destroy();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        System.out.println("Starting doget....................................");
        
        PrintWriter out = response.getWriter();
        
        out.print("<h1> This is GET method in ThirdServlet </h1>");
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("Starting dopost....................................");
    }
    @Override
    public String getServletInfo() {
        return "Short description Third Servlet";
    }

}
