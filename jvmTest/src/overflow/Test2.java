package overflow;

/**
 * @program: jvmTest
 * @description: 栈溢出
 * @author: fwb
 * @create: 2019-07-25 20:16
 **/
public class Test2 {
    private int length = 1;
    public void testLength(){
        length++;
        testLength();
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        try {
            test2.testLength();
        }catch (Throwable e){
            System.out.println(test2.length);
            System.err.println("栈溢出");
        }
    }
}
