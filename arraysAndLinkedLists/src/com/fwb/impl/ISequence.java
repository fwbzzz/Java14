package com.fwb.impl;

public interface ISequence {
    //在pso位置插入val
    boolean add(int pos, Object data);

    //查找关键字key，找到返回key的下标，没有返回-1
    int search(Object key);

    //查找关键字key是否在这个顺序表中（这个和search有点重复）
    boolean contains(Object key);

    //得到pos位置的值
    Object getPos(int pos);

    //删除第一次出现的关键字key
    Object delete(Object key);

    //得到顺序表的长度
    int size();

    //打印顺序表
    void display();

    //清空数据表以防内存泄漏
    void clear();
}