package fwb.doExercise;


import java.util.Stack;

/**
 * @program: stack
 * @description: 括号匹配：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * @author: fwb
 * @create: 2019-05-29 18:15
 **/
class Ex1 {
    public boolean isValid(String s) {
        //str -> char[]
        char[] data = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : data
             ) {
            //碰到左括号入栈
            if (c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                else if (c == '}'){
                    char temp = stack.peek();
                    if (temp == '{'){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }
                else if(c == ']'){
                    char temp = stack.peek();
                    if (temp == '['){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }
                else if(c == ')'){
                    char temp = stack.peek();
                    if (temp == '('){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}