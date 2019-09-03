package heap;

/*
堆的定义：
堆中某个节点的值一定不小于或者不大于他的父节点
堆是一个完全二叉树
 */
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Arrays;


/**
 * @program: bintree
 * @description: 基于数组实现的堆
 * @author: fwb
 * @create: 2019-06-25 19:29
 **/
public class Heap<E> {
    //实现任意类的大小比较
    private Comparator<E> comparator;
    private int size;
    private E[] elementData;
    //类似于treeMap的设计模式
    //默认初始容量
    private static final int DEFAULT_CAPACCITY = 10;

    public Heap(){
        this(DEFAULT_CAPACCITY,null);
    }

    public Heap(int initialCapacity){
        this(initialCapacity,null);
    }

    public Heap(int initialCapacity,Comparator<E> comparator){
        this.elementData = (E[]) new Object[initialCapacity];
        this.comparator = comparator;
    }

    /*
    heapify思想
    将任意数组整理成堆
    1.add
    2.从最后一个非叶子节点（((array.length - 1) - 1)/2）作为根节点开始siftDown直到整体根节点为止。
    （叶子节点没有子节点，所以不用调整了（因为它.天然满足堆的性质））
    第一个减一是找到最后一个节点，第二个减一再初二是找到最后一个节点的父节点。
     */
    public Heap(E[] arr){
        elementData = (E[]) new Object[arr.length];
        for (int i = 0;i < arr.length;i++){
            elementData[i] = arr[i];
        }
        size = elementData.length;
        //从最后一个非叶子节点开始下沉
        for (int i = ((arr.length - 1 -1)/2);i >= 0;i--){
            siftDown(i);
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /*
     比较两个元素的大小
    */
    private int compare(E o1,E o2){
        if (comparator == null){
            //此时E必须为Compareable接口的子类
            return ((Comparable<E>)o1).compareTo(o2);
        }
        return comparator.compare(o1,o2);
    }

    //找到节点的左孩子节点
    private int leftChildIndex(int index){
        return index * 2 + 1;
    }

    //找到节点的右孩子节点
    private int rightChildIndex(int index){
        return index * 2 + 2;
    }

    //找到节点的父节点
    private int fatherChildIndex(int index){
        if(index == 0){
            throw new IllegalArgumentException("根节点无父亲");
        }
        return (index - 1)/2;
    }

    //添加元素，默认在数组末尾添加元素，此时添加元素之后可能会破坏堆的定义
    /// 元素上浮（判断当前元素与父节点元素的大小）
    public void add(E e){
        //首先判断数组是否满了，如果满了则调用grow()方法扩大数组。
        if (elementData.length == size){
            grow();
        }
        //扩大完后，向数组末尾添加元素
        elementData[size++] = e;
        //调用siftUp()方法,因为size++跑到下一位去了,所以需要 -1
        siftUp(size - 1);
    }

    /*
    数组扩大操作
    如果数组长度小于64，那么扩大为原来的2倍，如果数组大小大于64则扩大为原来的1.5倍。
     */
    private void grow(){
        int oldCap = elementData.length;
        int newCap = oldCap + (oldCap < 64 ? oldCap : oldCap >>1);
        //减8是因为需要8个字节来存放自身大小
        if (newCap > Integer.MAX_VALUE - 8){
            throw new IndexOutOfBoundsException("数组过大");
        }
        //将原数组放入新的数组中
        elementData = Arrays.copyOf(elementData,newCap);
    }

    /*
    数据上浮操作，如过元素大于他的父节点那么将他与他的父节点交换位置，之后将父节点变为新的index，继续此操作
    知道index上浮到了根节点位置，循环终止
     */
    private void siftUp(int index){
        //index不是根节点，并且大于他的父节点
        while(index > 0 && compare(elementData[index],elementData[fatherChildIndex(index)]) > 0){
            swap(index,fatherChildIndex(index));
            index = fatherChildIndex(index);
        }
    }

    /*
    交换数据
     */
    private void swap(int indexA,int indexB){
        E temp = elementData[indexA];
        elementData[indexA] = elementData[indexB];
        elementData[indexB] = temp;
    }

    /*
    找到堆中最大元素，(大顶堆最大元素就是第一个elementData[o])
     */
    public E findMax(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("head is empty");
        }
        return elementData[0];
    }

    /*
    删除最大值，并将最大值返回
    1.将堆顶元素与堆的最后一个元素交换位置，然后将交换后堆的最后一个元素删除
    2.siftDown()，将交换后的元素下沉(将其与自己的左右孩子比较，与其中最大的交换位置，
    直到成为叶子节点（即左孩子的节点下标值大于节点个数），或者比左右孩子都大)
     */
    public E extractMax(){
        E result = findMax();
        //交换最后一个元素与堆顶元素位置
        swap(0,size-1);
        //删除最后一个元素
        elementData[--size] = null;
        //siftDown
        siftDown(0);
        return result;
    }

    /*
   将二叉树当前节点下沉到正确位置
   1.传入一个节点下标
   2.判断此节点是否为叶子节点
   3.如果是叶子节点则已经下沉到了堆底，函数结束
   4.如果不是，用先用j保存此节点左孩子的下标，此处还应该判断是否有右孩子，如果有右孩子还应该判断左右孩子的大小
   如果是右孩子比较大，则j++。（总之最终结果j保存的就是index左右孩子中最大的值）
   5.将index节点的数据与index左右孩子中的数据比较，
   6.如果index中的数据大于其左右孩子中的数据，则这就是一个堆
   7.如果不是那么将index中存的数据与左右孩子中最大的那个数据交换，此时这三个数形成了一个堆。
   8.交换完成之后应该将j所在的节点作为新的父节点继续与下面的两个子节点比较
   9.直到父节点大于子节点，或者到达堆底，
   */
    private void siftDown(int index){
        //如果左孩子节点下标大于size，则此节点一定是叶子节点，此时已经沉到了最底部，循环结束
        while(leftChildIndex(index) < size){
            //当前节点左孩子下标
            int j = leftChildIndex(index);
            //如果左孩子下标加一小于数组长度，那么一定有右孩子
            if (j + 1 < size){//之所以是小于size而不是小于等于是因为前面size--（画个图一目了然）
                //比较左右孩子大小，如果右孩子大，那么j++。
                if (compare(elementData[j],elementData[j + 1]) < 0){
                    //此时j为右孩子指引下标
                    j++;
                }
                //此时element[j]一定是左右孩子的最大值
            }
            //如果此节点数据大于他左右孩子，那么他已经下沉到了正确的位置，跳出
            if (compare(elementData[index],elementData[j]) > 0){
                break;
            }else{            //如果不是，那么将此节点的数据与左右孩子中最大的那个交换
                swap(index,j);
                index = j;
            }
        }
    }

    /*
    将堆顶元素替换掉
    1.extractMax(),add()(删掉最大的元素，再添加)
    2.siftDown(),(直接将栈顶元素替换掉，之后下沉，找到他的合适位置)
    */
    public E replace(E newValue){
        E result = findMax();
        elementData[0] = newValue;
        siftDown(0);
        return result;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(E e : elementData)
            if (e != null)
            res.append(e+"、");
        return res.toString();
    }
}
