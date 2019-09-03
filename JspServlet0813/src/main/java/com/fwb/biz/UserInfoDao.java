package com.fwb.biz;

import com.fwb.db.DbManager;
import com.fwb.vo.UserInfo;

import java.sql.ResultSet;

/**
 * @program: JspServlet0813
 * @description: 数据访问层
 * @author: fwb
 * @create: 2019-08-13 18:40
 **/
public class UserInfoDAO {
    //验证用户名和密码，做数据库的连接，查询数据库
    public int checkUserInfo(UserInfo userInfo){
        int flag = 0;
        String strSql = "select t_username,t_userpass from t_user where t_username='"
                +userInfo.getUserName()+"' and t_userpass='"+userInfo.getUserPass()+"'";
        try {
            DbManager dbManager = new DbManager();
            ResultSet rs = dbManager.queryMethod(strSql);
            String username = null;
            String password = null;
            while (rs.next()) {
                username = rs.getString("t_username");
                password = rs.getString("t_userpass");
                if (username.equals(userInfo.getUserName()) && password.equals(userInfo.getUserPass())) {
                    flag = 1;
                    return flag;
                } else {
                    flag = 0;
                    return flag;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}
