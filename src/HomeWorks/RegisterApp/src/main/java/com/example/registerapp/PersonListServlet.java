package com.example.registerapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/PersonList")
public class PersonListServlet extends HttpServlet {
    private static final String query = "SELECT * FROM persondata";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///person", "root", "Qw2332jha890");
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            out.println("<table><tr>");
            out.println("<th>Идентификатор пользователя</th>");
            out.println("<th>Имя</th>");
            out.println("<th>Фамилия</th>");
            out.println("<th>Эл.почта</th>");
            out.println("<th>Пароль</th>");
            out.println("<th>Редактирование</th>");
            out.println("<th>Удаление</th>");
            out.println("</tr>");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getInt(1) + "</td>");
                out.println("<td>" + resultSet.getString(2) + "</td>");
                out.println("<td>" + resultSet.getString(3) + "</td>");
                out.println("<td>" + resultSet.getString(4) + "</td>");
                out.println("<td>" + resultSet.getString(5) + "</td>");
                out.println("<td><a href='editScreen?id=" + resultSet.getInt(1) + "'>Редактирование</a></td>");
                out.println("<td><a href='deleteUrl?id=" + resultSet.getInt(1) + "'>Удалить</a></td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (SQLException exception) {
            exception.printStackTrace();
            out.println("<h2>" + exception.getMessage() + "</h2>");
        }
        out.println("<br><a href='index.html'>Главная</a>");
        out.println("</div></body></html>");
    }
}
