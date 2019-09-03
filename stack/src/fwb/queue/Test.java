package fwb.queue;

import fwb.queue.Impl.ArrayLoopQueue;
import fwb.queue.Impl.ArrayQueue;
import fwb.queue.Impl.LinkedQueue;

/**
 * @program: stack
 * @description: 测试
 * @author: fwb
 * @create: 2019-05-27 20:20
 **/
public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayLoopQueue<>(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
    }
}
