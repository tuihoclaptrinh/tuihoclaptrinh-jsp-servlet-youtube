package com.tuihoclaptrinh;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
@WebServlet(name = "SubmitForm", urlPatterns = {"/submit"})
public class SubmitFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");

            // Lấy thông tin từ biểu mẫu HTML
            String fullname = request.getParameter("fullname");
            String password = request.getParameter("password");
            int age = Integer.parseInt(request.getParameter("age"));
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");

            String[] hobbies = request.getParameterValues("hobby");
            String selectedSkill = request.getParameter("skills");

            // Hiển thị thông tin
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Form Data</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Form Data:</h2>");
            out.println("<p><strong>Name:</strong> " + fullname + "</p>");
            out.println("<p><strong>Password:</strong> " + password + "</p>");
            out.println("<p><strong>Age:</strong> " + age + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Gender:</strong> " + gender + "</p>");
            out.println("<p><strong>Hobbies:</strong> " + String.join(", ", hobbies) + "</p>");
            out.println("<p><strong>Skill:</strong> " + selectedSkill + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
