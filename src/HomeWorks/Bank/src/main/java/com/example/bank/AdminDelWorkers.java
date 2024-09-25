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

@WebServlet("/deleteUrl1")
public class AdminDelWorkers extends HttpServlet {
    private static final String query = "DELETE FROM worker_bank WHERE id = ?";

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
        out.println("<html><head><link rel='stylesheet' href='CSS/style.css'></head><body>");
        out.println("<div style=\"border-radius: 5px; background: linear-gradient(90deg, #b02424 0%, #751515 100%); height: 200px;\"> <button style=\"color: #ff0000; width: 200px; height: 100px; background-color: black; border: solid 5px #2d2c2c; margin-top: 50px; border-radius: 5px; position: absolute; margin-left: 20px\" id=\"GeneralMenu_ID\"><h2 style=\"font-family: 'Bauhaus 93';\">Bank</h2></button> <button style=\" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 700px; border: black solid 5px; border-radius: 20px; margin-top: 70px;\" id=\"AdminMenu_ID\">АДМИНИСТРАТОР</button> <button style=\"background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 900px; border: black solid 5px; border-radius: 20px; margin-top: 70px;\" id=\"WorkerMenu_ID\">РАБОТНИКИ</button> <button style=\" position: absolute; background-color: #726d6d; color: white; width: 160px; height: 40px; margin-left: 50px; margin-top: 70px; border: black solid 5px; border-radius: 20px;\" id=\"OtherMenu_ID\">УСЛУГИ</button></div>\n");
        out.println("<div style=\"width: 200px; height: 70px; background-color: white; font-size: 20px; text-align: center; color: red; border: solid 5px black; border-radius: 20px; font-weight: bold; margin-top: -150px; position: absolute; margin-left: 350px;\"><br>Admin</div>");
        out.println("<div style='width: 1300px; margin: 50px auto; border: 6px solid black; background: linear-gradient(30deg, #1a1a1a 0%, #1f1d1d 100%);'>");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///banksys", "root", "ExecuteOrder66");
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1,id);
            int row = preparedStatement.executeUpdate();
            if (row == 1){
                out.println("<h2 style='text-align: center; margin: 0; padding: 10px 0; background: linear-gradient(90deg, #b02424 0%, #751515 100%); border-radius: 1px 1px 0 0;'>Удаление прошло успешно!</h2>");
            } else {
                out.println("<h2 style='text-align: center; margin: 0; padding: 10px 0; background: linear-gradient(90deg, #b02424 0%, #751515 100%); border-radius: 1px 1px 0 0;' >Удаление не удалось!</h2>");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
            out.println("<h2>" + exception.getMessage() + "</h2>");
        }
        out.println("<br><a href='AdminP.jsp' style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;'>Вернуться в панель Администратора</a>");
        out.println("<br><a href='CustomizeWorkers' style='display: block;  text-align: center; margin: 10px; text-decoration: none; background: linear-gradient(0deg, #f81717 0%, #501313 100%); padding: 10px 0; border-radius: 0 0 6px 6px; color: white; font-weight: bold;' >Список работников</a>");
        out.println("</div></body></html>");
    }
}

