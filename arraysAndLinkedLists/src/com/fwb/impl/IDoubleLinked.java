package com.fwb.impl;

public interface IDoubleLinked {
    //头插法,从头结点前插入
    void addFirst(int data);
    //尾插法
    void addLast(int data);
    //任意位置插入，第一个数据1节点为0号下标
    boolean addIndex(int index, int data);
    //查找关键字key是否包含在单链表中
    boolean contains(int key);
    //删除第一次出现关键字key的节点
    int delete(int key);
    //删除所有值为key的节点
    void deleteAllkey(int key);
    //得到链表的长度
    int getLength();
    //清空
    void clear();
    //打印
    void display();
}
