/*
注
 */

public class Test3 {
    public static void main(String[] args) {
        System.out.println(test3());
    }
    public static int test3(){
        try{
            System.out.println(10/2);
            return 1;
        }catch(Exception e){      //直接catch父类这样不管什么类型的错都可以
            e.printStackTrace();
            return 2;
        }finally{
//            return 3;
            System.out.println("1231");
        }
    }
}
