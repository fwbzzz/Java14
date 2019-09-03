package fwb.queue;

/**
 * @program: stack
 * @description: 队列
 * @author: fwb
 * @create: 2019-05-27 19:24
 **/
public interface Queue<E> {
    /**
    * @Description: 入队，在队尾插入
    * @Param: [e]
    * @return: void
    */
    void enQueue(E e);

    /**
    * @Description: 出队，队首元素
    * @Param: [e]
    * @return: E
    */
    E deQueue();

    /**
    * @Description: 返回队首元素但是不出队
    * @Param: []
    * @return: E
    */
    E peek();

    int getSize();
    boolean isEmpty();
}
