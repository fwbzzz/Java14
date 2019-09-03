package fwb.stack.Impl;

import fwb.stack.Stack;

/**
 * @program: stack
 * @description: 链式栈
 * @author: fwb
 * @create: 2019-05-26 15:44
 **/
public class LinkedStack<T> implements Stack<T> {
    private Node top;//栈顶元素
    private int currentSize;//数量
    private class Node{
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }

    @Override
    public boolean push(T t) {
        Node newNode = new Node(t,null);
        if (top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        currentSize++;
        return true;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("当前栈为空");
            return null;
        }
        T result = top.t;//先取得当前栈顶的元素的值
        top = top.next;
        currentSize--;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("当前栈为空");
            return null;
        }
        return top.t;
    }

    @Override
    public int getSzie() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }
}
