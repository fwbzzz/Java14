package fwb.queue.Impl;

import fwb.queue.Queue;

/**
 * @program: stack
 * @description: 循环队列
 * @author: fwb
 * @create: 2019-05-27 21:33
 **/
public class ArrayLoopQueue<E> implements Queue<E> {
    private Object[] elementData;
    private int head;
    private int tail;
    private int size;

    public ArrayLoopQueue(int maxSize) {
        //多开辟一块空间用来区分环形队列到底是空还是满
        elementData = new Object[maxSize + 1];
    }

    @Override
    public void enQueue(E e) {
        if ((tail + 1)%elementData.length == head){
            System.err.println("队列已经满了");
            return;
        }
        elementData[tail] = e;
        // 不能直接tail++，需要按取模的方式得到他的下一位
        tail = (tail + 1) % elementData.length;
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()){
            System.err.println("队列为空");
            return null;
        }
        E result =  (E) elementData[head];
        head = (head + 1) % elementData.length;
        size--;
        return result;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            System.err.println("队列为空");
            return null;
        }
        return (E) elementData[head];
    }

    @Override
    public int getSize() {
        //head = 4,tail = 1,size = (4 + 1) % 8 = 5
        //head = 4,tail = 5,size = (4 + 5) % 8 = 1
        //不嗯能直接用tail - head
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }
}
