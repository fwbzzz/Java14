package com.fwb.dao;

import com.fwb.impl.ISequence;

import java.util.Arrays;

/*
顺序表
 */

public class SequenceImpl implements ISequence {

    private Object[] elemData;
    public int usedSize;//顺序表元素的个数
    public static final int DEFAULT_CAPACITY = 10;//数组初值设为10

    //构造方法
    public SequenceImpl() {
        this.elemData = new Object[DEFAULT_CAPACITY];
        this.usedSize = 0;
    }

    //判断是否为满
    private boolean isFull() {
        //如果是则返回true，不是则返回false
        return this.usedSize == this.elemData.length;
    }

    /*
    给pos位置插入数据i
    1.判断pos的合法性
    2.判断放入后是否溢出
    2.挪数据
    3.放入数据 usedSize++
     */
    @Override
    public boolean add(int pos, Object data) {

        if(pos < 0 || pos > this.usedSize){
            return false;
        }
        //如果顺序表是满的则需要扩容
        if (isFull()){
            //java.util.Arrays.copyOf（源数组名称，新数组长度）
            this.elemData = Arrays.copyOf(this.elemData,this.elemData.length*2);
        }
        //从pos位置开始数组向后推移，给新的元素让出一个位置
        for(int i = usedSize - 1;i >= pos; i--){
            elemData[i + 1] = elemData [i];
        }
        this.elemData[pos] = data;
        this.usedSize++;
        return true;
    }

    //写一个私有的方法，判断顺序表是否为空
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    /*
    找到第一个出现key的下标
    1.首先判断数组是否为空，如果是直接返回 -1
    2.从前向后遍历顺序表，将每个元素都与key比较一下，如果相等则返回下标
    3.遍历一遍没有相等的则返回 -1
    */
    @Override
    public int search(Object key) {
        if(isEmpty()){
            return -1;
        }
        if(key == null){
            //不支持的操作异常
            throw new UnsupportedOperationException("不可以传入null作为参数");
        }else{
            for (int i = 0;i <= this.usedSize;i++){
                //引用数据类型类、数组、接口)，应该用equals判断是否相等
                if(this.elemData[i].equals(key)){
                    return i;
                }
            }
        }
        return -1;
    }

    /*
    是否包含某个数据key
    与serach函数相象只是此函数是返回布尔型
    */
    @Override
    public boolean contains(Object key) {
        if(isEmpty()){
            return false;
        }
        for (int i = 0;i <= this.usedSize;i++){
            //引用数据类型，应该用equals判断是否相等
            if(this.elemData[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    /*
    找到pos位置的值
    1.判断pos的合法性，不合法返回为null
    2.合法直接返回pos所对应的那个元素
    */

    @Override
    public Object getPos(int pos) {
        if (pos < 0 || pos >= this.usedSize){
            return null;   
        }
        return this.elemData[pos];     
    }

    /*
    删除元素
    1. 遍历顺序表
    2. 如果没有，返回false
    3. 如果顺序表中有元素与key相等则key后面的数依次向前推移（将key覆盖掉）
    4. 顺序表长度 -1
     */
    @Override
    public Object delete(Object key) {
        //1.找到要删除的数
        //2.将它覆盖掉
        if(isEmpty()){
            return false;
        }
        int i = 0;
        //遍历数组，找到是否有数组元素与key相等
        for (i = 0;i < this.usedSize;i++){
            //引用数据类型，应该用equals判断是否相等
            if(this.elemData[i].equals(key)){
                //找到之后将数组从key所在位置开始向前推移，将key覆盖掉。
                //usedSize - 1是因为将key覆盖掉以后usedSize将会缩小一位
                //（在最后一位将倒数第二位覆盖掉以后，数组长度将缩小一位，所以无需遍历到删除前顺序表的最后一步）
                for (int j = i; j < this.usedSize -1; j++) {
                    elemData[j] = elemData[j + 1];
                }
            }
            //usedSize--;
        }
        //或者不要this.elemData[i-1] = null;，改为上面的usedSize--，因为下次添加元素会直接将其覆盖
        this.elemData[i-1] = null;
        return null;
        /*
        这种删除方法是调用之前写好的search方法，能稍微减少一下代码量
        int index = search(key);
        if (index == -1){
            return null;
        }
        Object oldData = this.elemData[index];
        int i = 0;
        for (i = index; i < this.usedSize -1; i++) {
            this.elemData[i] = this.elemData[i + 1];
        }
        this.elemData[i] = null;
        this.usedSize--;
        return oldData;
        */
    }
    
    //得到当前有效数据的个数
    @Override
    public int size() {
        return this.usedSize;
    }

    /*
    打印当前数组元素
     */
    @Override
    public void display() {
        for (Object obj:elemData
             ) {
            System.out.println(obj);
        }
    }

    //清除所有元素
    @Override
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elemData[i] = null;
        }
        this.usedSize = 0;
    }
}
