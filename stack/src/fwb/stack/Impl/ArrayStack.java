package fwb.stack.Impl;

import fwb.stack.Stack;

import java.util.Arrays;

/**
 * @program: Stack
 * @description: （顺序栈）基于数组的实现
 * @author: fwb
 * @create: 2019-05-26 14:23
 **/
public class ArrayStack<T> implements Stack<T>{
    //存放数据
    private Object[] elementData;
    //最多存放的元素个数
    private int maxSize;
    //当前存放个数
    private int currentSize;

    public ArrayStack(int maxSize) {
        this.elementData = new Object[maxSize];
        this.maxSize = maxSize;
    }
    //入栈
    @Override
    public boolean push(T t) {
        //首先判断一下栈是否满了
        if (currentSize == maxSize){
            int oldSize = maxSize;
            int newSize = oldSize<<1;//乘2
            maxSize = newSize;
            elementData = Arrays.copyOf(elementData,maxSize);
        }
//        if (currentSize == maxSize){
//            int oldSize = maxSize;
//            int newSize = oldSize<<1;//乘2
//            if (newSize + 8 >= Integer.MAX_VALUE){
//                System.out.println("栈太大");
//                return false;
//            }else{
//                maxSize = newSize;
//            }
//            elementData = Arrays.copyOf(elementData,maxSize);
//        }
        elementData[currentSize++] = t;
        return true;
    }
    //出栈
    @Override
    public T pop() {
        if (isEmpty()){
            System.out.println("栈为空");
            return null;
        }
        return (T) elementData[--currentSize];
    }
    //返回栈顶元素但是不出栈
    @Override
    public T peek() {
        if (isEmpty()){
            System.out.println("栈为空");
            return null;
        }
        return (T) elementData[currentSize - 1];//只是返回并不用出栈
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
