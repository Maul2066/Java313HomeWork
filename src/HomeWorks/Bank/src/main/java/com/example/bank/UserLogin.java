package com.example.bank;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/loginUser")
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        UserDao userDao = new UserDao(DBConnect.getConn());
        User user = userDao.login(email, password);
        if (user != null) {
            resp.sendRedirect("services.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}