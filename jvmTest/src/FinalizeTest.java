/**
 * @program: jvmTest
 * @description: 自我拯救
 * @author: fwb
 * @create: 2019-07-27 17:14
 **/
public class FinalizeTest {
    public static FinalizeTest finalizeTest;
    public void isAlive() {
        System.out.println("I am alive :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        finalizeTest = this;
    }

    public static void main(String[] args)throws Exception {
        finalizeTest = new FinalizeTest();
        finalizeTest = null;
        System.gc();
        Thread.sleep(500);
        if (finalizeTest != null) {
            finalizeTest.isAlive();
        }else {
            System.out.println("now,I am dead :(");
        }
        // 下面代码与上面完全一致，但是此次自救失败
        finalizeTest = null;
        System.gc();
        Thread.sleep(500);
        if (finalizeTest != null) {
            finalizeTest.isAlive();
        }else {
            System.out.println("now,I am dead :(");
        }
    }
}