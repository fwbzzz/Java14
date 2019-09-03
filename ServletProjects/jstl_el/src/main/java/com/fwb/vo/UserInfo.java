package com.fwb.vo;

/**
 * @program: ServletProjects
 * @description:
 * @author: fwb
 * @create: 2019-08-11 17:09
 **/
public class UserInfo {
    private String username;

    private Group group;

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", group=" + group +
                '}';
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public UserInfo(){ }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
