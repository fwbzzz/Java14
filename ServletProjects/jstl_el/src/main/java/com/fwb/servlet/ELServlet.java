package com.fwb.servlet;

import com.fwb.vo.Group;
import com.fwb.vo.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns= "/elServlet")
public class ELServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //测试EL表达式
        //1.普通字符串测试
        request.setAttribute("strKey","fwb");//设置值和名称到request中
        request.getRequestDispatcher("jstl_el.jsp").forward(request,response);//跳到jstl_el.jsp去

        //测试结构体
        Group group = new Group();
        group.setGname("Java");
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("fwb");
        userInfo.setGroup(group);
        request.setAttribute("userInfoKey",userInfo);

        //测试数组
        String[] strArray = new String[]{"a","b","c","d"};
        request.setAttribute("strArrayKey",strArray);

        //测试自定义数组

        //跳转
        request.getRequestDispatcher("jetl_el.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
