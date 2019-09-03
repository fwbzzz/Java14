/**
 * @program: threadJoin
 * @description:
 * @author: fwb
 * @create: 2019-08-15 23:16
 **/
public class ex {
    public static void main(String[] args) {
        System.out.println(A(5));
    }
    public static int A(int a){
        if(a == 1){
            return 1;
        }
        int sum = a * A(a - 1);
        return sum;
    }
}
