package fwb.queue.Impl;

import fwb.queue.Queue;

/**
 * @program: stack
 * @description: 数组实现队列
 * @author: fwb
 * @create: 2019-05-27 20:40
 **/
public class ArrayQueue<E> implements Queue<E> {
    private Object[] elementData;//泛型不能直接new数组
    private int head;
    private int tail;

    public ArrayQueue(int maxSize) {
        elementData = new Object[maxSize];
    }

    @Override
    public void enQueue(E e) {
        //队列长度指的时当前数组有多少元素
        if (tail == elementData.length){
            if (head == 0){
                System.err.println("当前队列已经满了");
                return;
            }else{
                //如果前面有没有利用到的数组空间，数组迁移，将前面空间填满,但是如果队列元素过多，这种方法会很慢
                //所以需要环形队列。
                for (int i = head;i < tail;i++){
                    elementData[i - head] = elementData[i];
                }
                //重新赋值头尾节点指针
                tail = tail - head;
                head = 0;
            }



        }
        //tail从1开始，指向数组中队列最后一个元素的下一位
        elementData[tail++] = e;
    }

    @Override
    public E deQueue() {
        if (isEmpty()){
            System.err.println("当前队列为空");
            return null;
        }else{
            return (E)elementData[head++];
        }
    }

    @Override
    public E peek() {
        if (isEmpty()){
            System.err.println("当前队列为空");
            return null;
        }
        return (E)elementData[head];
    }

    @Override
    public int getSize() {
        return tail - head;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }
}
