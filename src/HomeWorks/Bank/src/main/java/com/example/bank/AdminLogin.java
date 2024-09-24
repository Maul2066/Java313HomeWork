package com.example.bank;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/loginAdmin")
public class AdminLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        AdminDao AdminDao = new AdminDao(DBConnect.getConn());
        User user = AdminDao.login(email, password);
        if (user != null) {
            resp.sendRedirect("AdminP.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}
