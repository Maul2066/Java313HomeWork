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

@WebServlet("/editUrl1")
public class EditAply_WORKER_Servlet extends HttpServlet {
    private static final String query = "UPDATE worker_bank SET name=?, type=?, email=?, password=?  WHERE id=?";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("id"));
        String personName = req.getParameter("personName");
        String personSurname = req.getParameter("personSurname");
        String personGmail = req.getParameter("personGmail");
        String personPassword = req.getParameter("personPassword");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        out.println("<html><head><link rel='stylesheet' href='CSS/style.css'></head><body><div class='list'>");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///banksys", "root", "ExecuteOrder66");
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, personName);
            preparedStatement.setString(2, personSurname);
            preparedStatement.setString(3, personGmail);
            preparedStatement.setString(4, personPassword);
            preparedStatement.setInt(5, id);
            int row = preparedStatement.executeUpdate();
            if (row == 1){
                out.println("<h2 style='text-align: center; margin: 0; padding: 10px 0; background: linear-gradient(90deg, #b02424 0%, #751515 100%); border-radius: 1px 1px 0 0;' >Редактирование прошло успешно!<h2>");
            } else {
                out.println("<h2 style='text-align: center; margin: 0; padding: 10px 0; background: linear-gradient(90deg, #b02424 0%, #751515 100%); border-radius: 1px 1px 0 0;' >Редактирование не удалось!<h2>");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            out.println("<h2>" + exception.getMessage() + "</h2>");
        }
        out.println("<br><a href='AdminP.jsp' style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;'>Вернуться в панель Администратора</a>");
        out.println("<br><a href='CustomizeWorkers' style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;' >Список работников</a>");
        out.println("<script src=\"JS/button.js\"></script>");
        out.println("</div></body></html>");
    }
}