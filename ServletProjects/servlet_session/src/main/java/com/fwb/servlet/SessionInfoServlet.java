package com.fwb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/sessionInfoServlet")
public class SessionInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession httpSession = request.getSession(true);
        out.append("<html>")
                .append("<head><title>CookieServletDemo</title></head>")
                .append("<body>")
                //session的信息
                .append("sessionID:" + httpSession.getId() + "</br>")
                .append("newSessionID？" + httpSession.getId() + "</br>")
                .append("sessionCreateTime:" + new Date(httpSession.getCreationTime()) + "</br>")
                .append("sessionLastTime:" + new Date(httpSession.getLastAccessedTime()) + "</br>")
                //来自于request的请求
                .append("session via cookie:" + request.isRequestedSessionIdFromCookie() + "</br>")//是否来自于cookie
                .append("session via rewriteURL:" + request.isRequestedSessionIdFromURL() + "</br>")//是否来自于URl重写
                .append("session valid:" + request.isRequestedSessionIdValid() + "</br>")//是否是有效session


                .append("</body>")
                .append("</html>");


    }
}