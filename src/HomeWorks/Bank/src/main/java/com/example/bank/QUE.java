package com.example.bank;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/QUE_register")
public class QUE extends HttpServlet {
    private static final String query = "INSERT INTO Q_bank(full_name, request, numberPH) VALUES (?, ?, ?)";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String full_name = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///banksys", "root", "ExecuteOrder66");
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, full_name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            int row = preparedStatement.executeUpdate();
            out.println("<html><head><link rel='stylesheet' href='CSS/style.css'></head><body><div class='User_Register_JAVA_CLASS_FILE'>");
            if(row == 1) {
                out.println("<h2 class='User_Register_JAVA_CLASS_FILE_H2'>Пользователь зарегистрирован</h2>");
            } else {
                out.println("<h2 class='User_Register_JAVA_CLASS_FILE_H2'>Регистрация пользователя не удалась</h2>");
            }
        }catch (SQLException e) {
            e.printStackTrace();
            out.println("<h2 class='User_Register_JAVA_CLASS_FILE_H2'>" + e.getMessage() + "</h2>");
        }
        out.println("<br><div class='User_Register_JAVA_CLASS_FILE_DIV_HREF'><a class='User_Register_JAVA_CLASS_FILE_HREF' href='index.jsp'>Главная</a></div>");
        out.println("<br><div class='User_Register_JAVA_CLASS_FILE_DIV_HREF'><a class='User_Register_JAVA_CLASS_FILE_HREF' href='services.jsp'>Перейти к услугам</a></div>");
        out.println("</div></body></html>");
    }
}
