package ru.evm.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sasakin Maxim on 01.04.2017.
 */
public class Redirect extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;

        System.out.println(count);
        req.setAttribute("current_count", count);
        System.out.println("current_count " + req.getAttribute("current_count"));
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
