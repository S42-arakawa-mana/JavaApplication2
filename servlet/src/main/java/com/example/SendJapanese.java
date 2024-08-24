package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sendJapanese")
public class SendJapanese extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html></html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8' />");
        out.println("<title>sendJapanese</title>");
        out.println("</head>");
        out.println("<body>");
        out.print("<p>");
        out.print(request.getParameter("lastName"));
        out.print("　");
        out.print(request.getParameter("firstName"));
        out.print("さん、こんにちは。");
        out.print("</p>");
        out.println("</body>");
        out.println("</html>");
    }

}