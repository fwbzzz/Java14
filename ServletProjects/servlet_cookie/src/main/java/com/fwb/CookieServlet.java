package com.fwb;


import org.omg.CORBA.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
http://localhost:80/servlet_cookie/cookieServlet
 */

@WebServlet(urlPatterns = "/cookieServlet")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //to do something...
        //演示cookie
        /*
        内置对象：page，request，response，httpSession，application，exception，ServletContext，ServletConfig
        不需要自己new，tomcat会帮助你new
         */
        response.setContentType("text/html;charset=UTF-8");//回应一个html类型，文本格式，默认UTF—8
        PrintWriter out = response.getWriter();//获取打印对象
        for(int i = 0; i < 3; i++){
            Cookie cookie = new Cookie("cookieKey-"+i, "cookieValue-"+i);
            response.addCookie(cookie);

            cookie = new Cookie("PersistentCookieKey-"+i,"PersistentCookieValue-"+i);
            cookie.setMaxAge(36000);
            response.addCookie(cookie);

        }
        out.append("<html>")
                .append("<head><title>CookieServletDemo</title></head>")
                .append("<body>")
                .append("<a href='showServlet'>Go To Show Cookie</a>")
                .append("</body>")
                .append("</html>");
    }
}
