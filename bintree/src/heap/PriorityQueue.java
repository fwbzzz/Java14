package heap;

/**
 * @program: bintree
 * @description: 基于大顶堆的优先级队列
 * @author: fwb
 * @create: 2019-07-02 17:53
 **/
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {
    private Heap<E> heap  = new Heap<>();
    //入队
    @Override
    public void enqueue(E e) {
        heap.add(e);
    }

    //出队，不一定是先入先出，而是根据优先级，越大越早出
    @Override
    public E dequeue(E e) {
        return heap.extractMax();
    }

    //堆中最大元素
    @Override
    public E peek() {
        return heap.findMax();
    }

    @Override
    public int size() {
        return heap.getSize();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
