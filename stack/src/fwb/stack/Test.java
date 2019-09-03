package fwb.stack;

import fwb.stack.Impl.ArrayStack;
import fwb.stack.Impl.LinkedStack;
import fwb.stack.Stack;

/**
 * @program: stack
 * @description: 测试
 * @author: fwb
 * @create: 2019-05-26 15:40
 **/
public class Test {
    public static void main(String[] args) {
        Stack<Integer>stack = new ArrayStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.getSzie());
        System.out.println(stack.peek());
    }
}
