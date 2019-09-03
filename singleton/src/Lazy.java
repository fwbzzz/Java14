/*
懒汉式单例，只有调的时候才new
 */
class SingletonL{
    //先不new，此处有一个默认值为空
    private static SingletonL singletonL;
    private SingletonL(){}//构造方法私有化
    //静态方法，为了可以取出
    public static SingletonL getInstance(){
        if(singletonL == null){
            singletonL = new SingletonL();
        }
        return singletonL;
    }
    public void print(){
        System.out.println("Hello World");
    }
}

public class Lazy {
    public static void main(String[] args) {
        SingletonL singletonL = null;
        singletonL = SingletonL.getInstance();
        singletonL.print();
    }
}
