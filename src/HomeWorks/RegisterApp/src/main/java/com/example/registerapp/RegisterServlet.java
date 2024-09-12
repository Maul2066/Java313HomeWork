package com.example.registerapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final String query = "INSERT INTO persondata(personName, personSurname, personGmail, personPassword) VALUES (?, ?, ?, ?)";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        String personName = req.getParameter("personName");
        String personSurname = req.getParameter("personSurname");
        String personGmail = req.getParameter("personGmail");
        String personPassword = req.getParameter("personPassword");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///person", "root", "Qw2332jha890");
             PreparedStatement preparedStatement = connection.prepareStatement(query)){
                preparedStatement.setString(1, personName);
                preparedStatement.setString(2, personSurname);
                preparedStatement.setString(3, personGmail);
                preparedStatement.setString(4, personPassword);
                int row = preparedStatement.executeUpdate();
                out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
                if (row == 1){
                    out.println("<h2>Пользователь зарегистрирован</h2>");
                } else {
                    out.println("<h2>Регистрация не удалась</h2>");
                }
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
            out.println("<h2>" + sqlException.getMessage() +"</h2>");
        }
        out.println("<br><a href='index.html'>Главная</a>");
        out.println("<br><a href='PersonList'>Список пользователей</a>");
        out.println("</div></body></html>");
    }
}
