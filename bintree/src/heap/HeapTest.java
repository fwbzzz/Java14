package heap;

import java.util.Random;

/**
 * @program: bintree
 * @description:
 * @author: fwb
 * @create: 2019-06-26 17:03
 **/
public class HeapTest {
    /*
    测试heapify 与 add的速度差,heapify应该是比add方法快一倍的，之所以结果没有这么精确的原因是，
    Java语言需要经过JVM，而且中间向数组中加入数据也需要花费时间
     */
    private static void testHeapify(Integer[] arr, boolean isHeapify) {
        long start = System.currentTimeMillis();
        Heap<Integer>  heap = new Heap<>();
        if (isHeapify){
            heap =  new Heap<>(arr);
        }else{
            heap = new Heap<>(arr.length);
            for (int i : arr){
                heap.add(i);
            }
        }
        //测试堆的性质
        int[] test = new int[arr.length];
        //test[]中元素是堆中元素从大到小排列
        for (int i = 0;i < arr.length;i++){
            test[i] = heap.extractMax();
        }
        //如果出现下一位大于上一位的情况，那么说明程序运行有误
        for (int i = 1;i < arr.length;i++){
            if (test[i - 1] < test[i]){
                throw new IllegalArgumentException("Error!");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Test Completed!");
        System.out.println("共耗时：" + (end - start) + "ms");
    }

    public static void main(String[] args) {
        int n = 10000;
        Random random = new Random();
        Integer[] data = new Integer[n];
        for (int i = 0;i < n;i++){
            data[i] = random.nextInt(Integer.MAX_VALUE);
        }
        System.out.println("add()耗时");
        testHeapify(data,false);
        System.out.println("Heapify()耗时");
        testHeapify(data,true);
    }
}
//    正常的代码测试
//    public static void main(String[] args) {
//        Integer[] nums = new Integer[]{15,17,19,13,16,22,28,30,62,41};
//        Heap<Integer> heap = new Heap<>(nums);
//        System.out.println(heap);
//        System.out.println("------------------");
//        for (int i : nums) {
//            heap.add(i);
//        }
//        System.out.println(heap);
//        heap.add(52);
//        System.out.println(heap);
//        heap.extractMax();
//        System.out.println(heap);
//        System.out.println(heap.replace(38));
//        System.out.println(heap);
//    }
//}
//        /*
//        堆排序，
//         */
//        int n = 100000;
//        Random random =  new Random();
//        Heap<Integer> heap = new Heap<>(n);
//        for (int i = 0;i < n;i++){
//            heap.add(random.nextInt(Integer.MAX_VALUE));//在整数的最大范围内取1000000个随机数
//        }
//        int[] nums = new int[n];
//
//        for (int j = heap.getSize() - 1;j >= 0;j--){
//            nums[j] = heap.extractMax();
//        }
//        for (int j : nums){
//            System.out.println(j + "、");
//        }
//        System.out.println("Test Completed!");
//    }

