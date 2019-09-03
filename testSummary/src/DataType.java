

public class DataType {
    byte b1=1,b2=2,b3,b6,b8;
    final byte b4=4,b5=6,b7=9;
    public void test() {
//        b3=(b1+b2); Error:(7, 15) java: 不兼容的类型: 从int转换到byte可能会有损失
          b3=(byte)(b1+b2);//从int到byte需要强转
          b6=b4+b5;
//        b8=(b1+b4);//一个是int，一个是byte，int + byte变为int，还是需要强转
          b8 = (byte)(b1 + b4);
//        b7=(b2+b5);//常量不能变
        System.out.println(b3+b6);
    }

    public static void main(String[] args) {
         new DataType().test();
    }
}
