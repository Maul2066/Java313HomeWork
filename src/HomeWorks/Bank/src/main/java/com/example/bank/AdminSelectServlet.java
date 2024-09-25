package com.example.bank;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/CustomizeHumanoids")
    public class AdminSelectServlet extends HttpServlet {
        private static final String query = "SELECT * FROM user_bank";

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
            out.println("<html><head><link rel='stylesheet' href='CSS/style.css'></head><body>");
            out.println("<div style=\"border-radius: 5px; background: linear-gradient(90deg, #b02424 0%, #751515 100%); height: 200px;\"> <button style=\"color: #ff0000; width: 200px; height: 100px; background-color: black; border: solid 5px #2d2c2c; margin-top: 50px; border-radius: 5px; position: absolute; margin-left: 20px\" id=\"GeneralMenu_ID\"><h2 style=\"font-family: 'Bauhaus 93';\">Bank</h2></button> <button style=\" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 700px; border: black solid 5px; border-radius: 20px; margin-top: 70px;\" id=\"AdminMenu_ID\">АДМИНИСТРАТОР</button> <button style=\"background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 900px; border: black solid 5px; border-radius: 20px; margin-top: 70px;\" id=\"WorkerMenu_ID\">РАБОТНИКИ</button> <button style=\" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 50px; margin-top: 70px; border: black solid 5px; border-radius: 20px;\" id=\"OtherMenu_ID\">УСЛУГИ</button></div>\n");
            out.println("<div style=\"width: 200px; height: 70px; background-color: white; font-size: 20px; text-align: center; color: red; border: solid 5px black; border-radius: 20px; font-weight: bold; margin-top: -150px; position: absolute; margin-left: 350px;\"><br>Admin</div>");
            out.println("<div style='width: 1300px; margin: 50px auto; border: 6px solid black; background: linear-gradient(30deg, #1a1a1a 0%, #1f1d1d 100%);'>");
            try (Connection connection = DriverManager.getConnection("jdbc:mysql:///banksys", "root", "ExecuteOrder66");
                 PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                out.println("<table style='width: 100%; border: 6px solid black; border-collapse: collapse; text-align: center'><tr>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>Идентификатор пользователя</th>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>ФИО</th>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>Эл.почта</th>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>Пароль</th>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>Редактирование</th>");
                out.println("<th style='border: 6px solid black; padding: 10px; background: linear-gradient(90deg, #b02424 0%, #751515 100%);'>Удаление</th>");
                out.println("</tr>");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    out.println("<tr>");
                    out.println("<td style='border: 6px solid black; color: red;'>" + resultSet.getInt(1) + "</td>");
                    out.println("<td style='border: 6px solid black; color: red;'>" + resultSet.getString(2) + "</td>");
                    out.println("<td style='border: 6px solid black; color: red;'>" + resultSet.getString(3) + "</td>");
                    out.println("<td style='border: 6px solid black; color: red;'>" + resultSet.getString(4) + "</td>");
                    out.println("<td style='border: 6px solid black;'><a style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;' href='editScreen?id=" + resultSet.getInt(1) + "'>Редактирование</a></td>");
                    out.println("<td style='border: 6px solid black;'><a style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;' href='deleteUrl?id=" + resultSet.getInt(1) + "'>Удалить</a></td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } catch (SQLException exception) {
                exception.printStackTrace();
                out.println("<h2>" + exception.getMessage() + "</h2>");
            }
            out.println("<script src=\"JS/button.js\"></script>");
            out.println("</div></body></html>");
        }
}
