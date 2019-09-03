package java_0528;

/**
 * @program: doExercise
 * @description: n个数里最小的k个,每个测试输入包含空格分割的n+1个整数，最后一个整数为k值
 * @author: fwb
 * @create: 2019-05-29 12:47
 **/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int[] array = new int[strs.length - 1];
            int k = Integer.valueOf(strs[strs.length - 1]);
            for (int i = 0; i < strs.length - 1; i++) {
                array[i] = Integer.valueOf(strs[i]);
            }
            int n = array.length;
            if (n <= 1) {
                return;
            } else {
                for (int i = 0; i < n; i++) {
                    boolean flag = false;
                    for (int j = 0; j < n - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            flag = true;
                            //交换两个相邻元素
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                    if (!flag) {
                        break;
                    }
                }
            }
            if (k > array.length){
                System.out.println("错误！");
            }else{
                for (int i = 0; i < k; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
