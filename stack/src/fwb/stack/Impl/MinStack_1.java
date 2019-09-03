package fwb.stack.Impl;

import java.util.Stack;

/**
 * @program: stack
 * @description: 常数时间内检索到最小元素的栈
 * @author: fwb
 * @create: 2019-05-26 17:24
 **/

//双栈解法
class MinStack_1 {
    //存放具体数值的栈
    private Stack<Integer>dataStack;
    //存放栈的最小元素
    private Stack<Integer>minStack;
    /** initialize your data structure here. */
    public MinStack_1() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        //之所以需要 <= 原因：
        //dataStack：0 1 0
        //minStack：0
        //执行getMin，pop之后，最小的还应该为0
        //但是，由于pop()方法中设置dataStack.peek() == minStack.peek()，
        //如果只是 < 的话就会少放一个，导致控制空指针异常
        if (minStack.isEmpty()||x <= minStack.peek()){
            minStack.push(x);
        }
        dataStack.push(x);
    }
    //删除栈顶元素
    public void pop() {
        if (dataStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        dataStack.pop();
    }
    //取得栈顶元素
    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack_1 minStack = new MinStack_1();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}


