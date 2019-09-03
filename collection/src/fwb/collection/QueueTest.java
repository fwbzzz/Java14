package fwb.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: collection
 * @description: 队列
 * @author: fwb
 * @create: 2019-08-14 14:11
 **/
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
