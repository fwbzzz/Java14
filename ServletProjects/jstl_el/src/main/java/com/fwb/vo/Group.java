package com.fwb.vo;

public class Group {
    private String gname;

    public Group(){

    }

    @Override
    public String toString() {
        return "Group{" +
                "gname='" + gname + '\'' +
                '}';
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Object getName() {
        return null;
    }
}
