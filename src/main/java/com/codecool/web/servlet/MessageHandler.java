package com.codecool.web.servlet;

import com.codecool.web.model.Message;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/wall")
public class MessageHandler extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext scx = req.getServletContext();
        List<Message> messages = (List<Message>)scx.getAttribute("data");
        if (req.getParameter("username") != null && req.getParameter("content") != null
            && !req.getParameter("username").equals("") && !req.getParameter("content").equals("")) {
            String username = req.getParameter("username");
            String content = req.getParameter("content");
            Message message = new Message(username,content);
            messages.add(message);
        }
        req.setAttribute("messages", messages);

        req.getRequestDispatcher("messages.jsp").forward(req, resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
