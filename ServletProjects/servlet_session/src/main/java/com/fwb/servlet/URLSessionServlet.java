package com.fwb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: ServletProjects
 * @description:
 * @author: fwb
 * @create: 2019-08-11 15:43
 **/

@WebServlet(urlPatterns = "/UurlSessionServlet")
public class URLSessionServlet extends HttpServlet {
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

                .append("sessionID:" + httpSession.getId() + "</br>")
                .append("session via cookie:" + request.isRequestedSessionIdFromCookie() + "</br>")
                .append("session via URL:" + request.isRequestedSessionIdFromURL() + "</br>")
                .append("session via url:" + response.encodeURL(request.getRequestURI().toString()) + "</br>")
                .append("session via url(Rewrite):" + response.encodeURL(request.getRequestURI().toString()) + "</br>")
                .append("</body>")
                .append("</html>");

    }
}

