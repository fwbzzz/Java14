package fwb.stack;

/**
 * @program: Stack
 * @description: 栈
 * @author: fwb
 * @create: 2019-05-26 14:10
 **/
public interface Stack<T> {
    /** 
    * @Description: 入栈
    * @Param: [t] 
    * @return: boolean 
    */ 
    boolean push(T t);
    /**
    * @Description: 出栈
    * @Param: []
    * @return: T
    */
    T pop();
    /**
    * @Description: 返回栈顶元素但是不出栈
    * @Param: []
    * @return: T
    */
    T peek();
    /**
    * @Description: 返回当前栈的个数
    * @Param: []
    * @return: int
    */
    int getSzie();
    /**
    * @Description: 栈是否为空
    * @Param: []
    * @return: boolean
    */
    boolean isEmpty();
}
