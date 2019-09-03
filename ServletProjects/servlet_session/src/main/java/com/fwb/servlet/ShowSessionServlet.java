package com.fwb.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showSessionServlet")
public class ShowSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //测试Session
        //访问到showSessionServlet，如果是第一次访问就创建一个新的Session，
        HttpSession httpSession = request.getSession(true);
        //(做一个标识：第一次：newer，很多次以后)
        String message = null;
        Integer accessCount = (Integer) httpSession.getAttribute("accessCount");//拿到上一个界面的值
        if (accessCount == null){
            accessCount = 0;//第一次来的时候是0
            message = "newer";
            httpSession.setAttribute("accessCount",accessCount);
        }else{
            //accessCount = new Integer(accessCount.intValue() + 1);
            accessCount = accessCount + 1;
            message = "older";
            httpSession.setAttribute("accessCount",accessCount);
        }
        out.append("<html>")
                .append("<head><title>CookieServletDemo</title></head>")
                .append("<body>")
                .append("<table border = '1', align = 'center'>")
                .append("<h1>'"+ message+"'<h1></br>")
                .append("<tr>")
                .append("<td>SessionID</td>")
                .append("<td>'"+httpSession.getId()+"'</td>")
                .append("<tr>")

                .append("<tr>")
                .append("<td>Session Create Time</td>")
                .append("<td>'"+httpSession.getCreationTime()+"'</td>")//创建时间
                .append("<tr>")

                .append("<tr>")
                .append("<td>Session Access Last Time</td>")
                .append("<td>'"+httpSession.getLastAccessedTime()+"'</td>")//最后访问时间
                .append("<tr>")

                .append("<tr>")
                .append("<td>Access Count</td>")
                .append("<td>'"+accessCount+"'</td>")//访问次数
                .append("<tr>")

                .append("</table>")
                .append("</body>")
                .append("</html>");


    }
}
