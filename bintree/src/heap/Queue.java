package heap;

/**
 * @program: bintree
 * @description: 优先级队列接口
 * @author: fwb
 * @create: 2019-07-02 17:51
 **/
public interface Queue<E> {
    void enqueue(E e);
    E dequeue(E e);
    E peek();
    int size();
    boolean isEmpty();
}
