package sortEx;

/**
 * * @program: question
 * @description: 排序
 * @author: fwb
 * @create: 2019-08-08 14:35
 **/
public class Ex {
    public static void main(String[] args) {
        int[] a = new int[]{9,8,7,6,1,2,3,4,5};
       //maopao(a);
        //charu3(a);
        xuanze(a);
        for (int i:a
                ) {
            System.out.println(i);
        }
    }

    public static void maopao(int[] a){
        int l = a.length;
        for (int i = 0; i < l - 1; i++){
            boolean flag = false;
            for (int j = 0;j < l - i - 1;j++){
                if (a[j] > a[j + 1]){
                    flag = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if (!flag){
                System.out.println("执行到" + i +"已经有序");
                break;
            }
        }
    }

    public static void charu1(int[] a){

        int n = a.length;
        //外层循环是将所有元素遍历一遍
        //内层循环是给当前元素找到位置
        //两层循环过后所有元素都找到了正确的位置
        for(int i = 1;i < n;i++){
            //已排序集合的最后一个元素下标
            int j = i - 1;
            //待排序集合的第一个元素
            int value = a[i];
            //将待排序元素与已经排好序的数组（从最后一个元素开始，每次j--向前推进）作比较，
            //如果已经排好的元素大于待排序的元素，则将其向后移一位（array[j + 1] = array[j];）
            //直到遇到小于待排序的元素，或者到头，则将需要排序的元素其插入到这个小于待排序的元素后方。
            for(;j >= 0;j--){
                if(a[j] > value){
                    a[j + 1] = a[j];
                }else{
                    break;
                }
                //假如此时已经到了最后一步，j--后，比较array[j]与value的大小，发现value不小于array[j]
                //则将value放在array[j]的后面，也就是array[j + 1] = value;
                //并且此时的array[j + 1]的值已经在上一轮的循环中依次向后推移了，所以不必担心，array[j]后面的值没被保存
            }
            a[j + 1] = value;
        }
    }


    private static void charu2(int[] a){
        int l = a.length;
        for (int i = 1; i < l - 1; i++){
            int val = a[i];
            int low = 0;
            int high = i - 1;
            while(low <= high){
                int mid = (low + high)/2;
                if (a[mid] < val){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
            int j = i - 1;
            for (; j > high; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = val;
        }
    }

    private static void charu3(int[] a){
        int l = a.length;
        int step = l/2;
        while(step >= 1){
            for (int i = step; i < l; i++){
                int val = a[i];
                int j = i - step;
                for (; j >= 0; j-=step) {
                    if (a[j] > val){
                        a[j + step] = a[j];
                    }else{
                        break;
                    }
                }
                a[j + step] = val;
            }
            step = step/2;
        }
    }

    private static void xuanze(int[] a){
        int l = a.length;
        for (int i = 0; i < l - 1; i++) {
            int min = i;
            for (int j = i + 1; j < l; j++) {
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if (a[i] != a[min]){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;

            }
        }
    }
}