package fwb.collection;

import java.util.Stack;

/**
 * @program: collection
 * @description: 栈
 * @author: fwb
 * @create: 2019-08-14 14:06
 **/
public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}