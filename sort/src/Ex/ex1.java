package Ex;

/**
 * @program: sort
 * @description:
 * @author: fwb
 * @create: 2019-08-16 23:36
 **/
public class ex1 {
    public static void main(String[] args) {
        int[] a = new int[]{5,9,7,1,23,6,48};
        int n = a.length;
        for(int i = 1; i < n; i++){
           int j = i - 1;
           int value = a[i];
           for(;j >= 0; j--){
               if (a[j] > value){
                   a[j + 1] = a[j];
               }else{
                   break;
               }
           }
           a[j+1] = value;
        }
        for (int i:a
             ) {
            System.out.println(i);
        }
    }
}
