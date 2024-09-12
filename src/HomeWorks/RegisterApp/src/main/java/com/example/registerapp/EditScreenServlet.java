package com.example.registerapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/editScreen")
public class EditScreenServlet extends HttpServlet {
    private static final String query = "SELECT personName, personSurname, personGmail, personPassword FROM persondata WHERE id = ?";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        int id = Integer.parseInt(req.getParameter("id"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body><div class='list'>");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///person", "root", "Qw2332jha890");
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            out.println("<form action='editUrl?id=" + id + "' method='post'>");
            out.println("<table>");

            out.println("<tr>");
            out.println("<td>Имя</td>");
            out.println("<td><input type='text' name='personName' value='" + resultSet.getString(1) +"'></td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Фамилия</td>");
            out.println("<td><input type='text' name='personSurname' value='" + resultSet.getString(2) +"'></td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Эл.почта</td>");
            out.println("<td><input type='text' name='personGmail' value='" + resultSet.getString(3) +"'></td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Пароль</td>");
            out.println("<td><input type='text' name='personPassword' value='" + resultSet.getString(4) +"'></td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td><input type='submit' value='изменить' class='submit'></td>");
            out.println("<td><input type='reset' value='отменить' class='reset'></td>");
            out.println("</tr>");

            out.println("</table>");
            out.println("</form>");
        } catch (SQLException exception) {
            exception.printStackTrace();
            out.println("<h2>" + exception.getMessage() + "</h2>");
        }
        out.println("<br><a href='index.html'>Главная</a>");
        out.println("</div></body></html>");
    }
}
