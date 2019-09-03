package heap;

import java.util.Random;

/**
 * @program: bintree
 * @description: 堆排序
 * @author: fwb
 * @create: 2019-06-28 17:12
 **/
public class HeapSort {
    public static void heapSort1(Integer[] arr){
        //将数组调整成一个堆
        Heap<Integer> heap = new Heap<>(arr);
        //从最后一个位置开始,倒着放入数组中，则此数组为从大到小排列的数组
        for(int i =  arr.length - 1;i >= 0;i--){//n
            arr[i] = heap.extractMax();//logn
            //所以堆排序的时间复杂度为nlogn，
            //堆排序是一个时间复杂度很稳定的算法。因为，for循环一定是n，然后堆首先是一个完全二叉树
            //因为有结构的限制，堆永远不会退化成一个链表，
            //extractMax()永远不会退化成O（n）所以堆排序永远不会退化成O（n²）
            //但是快速排序就很有可能，如果数据近乎有序他将变成一个链表
            //空间复杂度为O（n）
        }
    }

    /*
    原地堆排序
    1.先将数组变为堆（即，从完全二叉树变成堆）
     */
    public static void heapSort2(Integer[] arr){
        int length = arr.length;
        //将数组变成一个堆，从最后一个非叶子节点开始循环，每循环一次，i减一，则从上一个开始继续排序
        for (int i = (length - 1- 1)/2;i >= 0;i--){
            //swap(0,i);
           //swap(arr,0,i);//fuck！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！

            //siftDown(i)，一定能保证一个元素在堆的最终位置，所以原来判断的元素就不用再判断了。
            siftDown(arr,i,0);
        }
        //依次将最大值放到数组末尾
        for (int i = length - 1;i >=0;i--){
            swap(arr,0,i);
            siftDown(arr,i,0);
        }
    }
    private static void swap(Integer[] arr,int indexA,int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    /*
    arr需要调整的数组，n需要调整的数组长度，k需要调整的位置
     */
    private static void siftDown(Integer[] arr,int n,int k){
        while(2*k + 1 < n){
            int j = 2*k + 1;
            //取出左右孩子的最大值
            if (j + 1 < n){
                if (arr[j].compareTo(arr[j + 1]) < 0){
                    j++;
                }
            }
            //arr[j]存放着左右两个字孩子的最大值
            if (arr[k] > arr[j]) {
                break;
            }else{
                swap(arr,k,j);
                k = j;
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n =100;
        Random random = new Random();
        Integer[] data = new Integer[n];
        for (int i = 0;i < n;i++){
            data[i] = random.nextInt(1000);
        }
//        heapSort1(data);
//        for (int temp :
//                data) {
//            System.out.println(temp + "、");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("堆排序耗时：" +  (start - end) + "ms");
        heapSort2(data);
        for (int temp : data){
            System.out.println(temp + "、");
        }
    }
}
