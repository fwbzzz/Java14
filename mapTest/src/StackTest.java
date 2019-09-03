import java.util.Stack;

/**
 * @program: mapTest
 * @description:
 * @author: fwb
 * @create: 2019-07-25 15:39
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
