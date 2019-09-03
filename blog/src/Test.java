public class Test{
    public static  void  main(String[] args){
        print(10);
        print('a');
        print(10,20);
    }
    public static void print(int x){
        System.out.println(x);
    }
    public static void print(char c){
        System.out.println(c);
    }
    public static void print(int  x,int y){
        System.out.println(x + y);
    }
}
