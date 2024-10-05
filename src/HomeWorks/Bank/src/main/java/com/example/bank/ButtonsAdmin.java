package com.example.bank;

import com.example.bank.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/admin_buttons")
public class ButtonsAdmin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");


            if("Пользователи".equals(name)) {
//                resp.sendRedirect("CustomizeHumanoids.jsp");
                resp.sendRedirect("CustomizeHumanoids");
            } else if ("Работники".equals(name)) {
//                resp.sendRedirect("CustomizeWorkers.jsp");
                resp.sendRedirect("CustomizeWorkers");
            } else if ("Регистрация персонала".equals(name)) {
                resp.sendRedirect("registerWorker.jsp");
            } else if ("Просмотр заявок".equals(name)) {
                resp.sendRedirect("Qcheck.jsp");
            } else {
                resp.sendRedirect("AdminP.jsp");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
