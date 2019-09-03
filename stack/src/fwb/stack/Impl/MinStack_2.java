package fwb.stack.Impl;
import java.util.Stack;

/**
 * @program: stack
 * @description: 单栈解法:元素A：具体的数据，元素B：当前最小值
 * @author: fwb
 * @create: 2019-05-27 17:49
 **/
public class MinStack_2 {
    private Stack<Integer> stack = new Stack<>();
    public MinStack_2() {

    }
    //-2 0 -3
    //-2 -2 0 -3 -3
    public void push(int x) {
        if (stack.isEmpty()){
            stack.push(x);
            stack.push(x);
        }else{
            int temp = stack.peek();//0
            stack.push(x);
            if (x < temp){
                stack.push(x);
            }else{
                stack.push(temp);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        int temp = stack.pop();
        int result = stack.peek();
        stack.push(temp);
        return result;
    }

    public int getMin() {
        return stack.peek();
    }
}
