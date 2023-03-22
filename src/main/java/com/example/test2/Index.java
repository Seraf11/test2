package com.example.test2;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import start.Report;
import start.ReportDB;


@WebServlet("/index")
public class IndexReport extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 2551309585623715359L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Report> reports = ReportDB.select();
        request.setAttribute("report", reports);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
