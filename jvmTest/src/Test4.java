import java.lang.ref.SoftReference;

/**
 * @program: jvmTest
 * @description: 软引用
 * @author: fwb
 * @create: 2019-07-27 17:00
 **/
public class Test4 {
        private static int _1MB = 1024 * 1024;
        private byte[] bigSize = new byte[2 * _1MB];
        public static void main(String[] args) {
            Test4 test4 = new Test4();
            SoftReference<Test4> softReference =
                    new SoftReference<>(test4);
            test4 = null;
            System.gc();
        }
    }
