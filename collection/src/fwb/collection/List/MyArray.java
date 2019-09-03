package fwb.collection.List;

import java.util.Arrays;

/**
 * @program: collection
 * @description: 自定义一个动态数组
 * @author: fwb
 * @create: 2019-07-14 18:35
 **/
public class MyArray<E> {
    private E[] elementData;
    private final static int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArray(){
       this(DEFAULT_CAPACITY);//elementData = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArray(int initCap){
        elementData = (E[]) new Object[initCap];
    }

    public void add(E e){
        //此时数组已经满了，需要扩容
        if (size == elementData.length){
            int oldCap = elementData.length;
            int newCap = oldCap + ((size < 64)?oldCap:oldCap>>1);
            if (newCap > Integer.MAX_VALUE - 8){
                throw new IndexOutOfBoundsException("数组元素过多");
            }
            elementData = Arrays.copyOf(elementData,newCap);
        }
        elementData[size++] = e;
    }
}
