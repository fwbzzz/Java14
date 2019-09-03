<%@ page import="com.fwb.vo.UserInfo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--isELIgnored="false"意思是是否忽略el表达式--%>
<%--el表达式用来剔除Scriplet，声明，表达式--%>
<html>
<head>
    <title>测试el表达式</title>
</head>
<>

<%--&lt;%&ndash;--%>
<%--<%:Scriptlet语言，在jsp写java--%>
<%--&ndash;%&gt;--%>
    <%--<%--%>
        <%--UserInfo userInfo = new UserInfo();--%>
        <%--userInfo.setUsername("arvin");--%>
        <%--System.out.println("username = " + userInfo.getUsername());//打印到控制台--%>
    <%--%>--%>

<%--&lt;%&ndash;表达式，可以打印到页面&ndash;%&gt;--%>
<%--<%=userInfo.getUsername()%>--%>

<%--&lt;%&ndash;声明(声明一个方法)&ndash;%&gt;--%>
<%--<%!public void sayHello(){}%>--%>
<%--<% out.println();%>--%>
    <h1>测试EL表达式</h1><br>
    <p/>
    <li>普通字符串测试</li><br>
    <%--strKey:<%= request.getAttribute("strKey")  %> <br> 这是用Java代码通过strKey名字拿到这个值，不提倡这样做--%>
    <%----%>
    strKey(EL):${requestScope.strKey}<br>
    strKey(EL):${strKey}<br>
<%--如果不写会从小的范围往大的范围找，如果最大的范围也没有就会报错：404--%>
    <li>结构测试</li><br>
    <%--userInfo(username/groupName):--%>
    <%--<%--%>
        <%--UserInfo userInfo = (UserInfo) request.getAttribute("userInfoKey");--%>
    <%--%>--%>
    <%--<%= userInfo.getUsername()%>--%>
    <%--<%= userInfo.getGroup().getgName()%><<br>
    通过Java--%>
    userInfo(username/groupName)[EL]:${requestScope.userInfoKey.username}<br>
<%--第一个.后面拿到userInfo对象，同UserInfo userInfo = (UserInfo) request.getAttribute("userInfoKey");这句话
     第二个.后面得到name同：userInfo.getUsername
     --%>
userInfo(username/groupName)[EL]:${requestScope.userInfoKey.group.gName}

<li>字符串数组测试</li><br>
strArray(EL)<br>
strArray[0] : ${strArrayKey[0]}
strArray[1] : ${strArrayKey[1]}
strArray[2] : ${strArrayKey[2]}
strArray[3] : ${strArrayKey[3]}



</body>
</html>
