package com.example.bank;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/loginWorker")
public class WorkerLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        WorkerDao workerDao = new WorkerDao(DBConnect.getConn());
        User user = workerDao.login(email, password);
        if (user != null) {
            resp.sendRedirect("services.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}

