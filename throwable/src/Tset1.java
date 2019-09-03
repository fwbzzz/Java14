/*
catch（出现异常后咋处理）
 */
public class Tset1 {
    public static void main(String[] args) {
        System.out.println("1.计算开始前");
        try {
            System.out.println("1.计算开始"+(10/0));
        }catch (ArithmeticException e){
            //java.lang.ArithmeticException(包名.类名)
            //catch 这里捕获了这个ArithmeticException e异常（这个异常实际是一个对象（一切皆对象））
            //System.out.println("程序出错");//这样描述只知道出错，但是不知道具体报啥错
            e.printStackTrace();//输出错误堆栈信息，catch里面代码块比较固定
        }
//        System.out.println("1.计算开始"+(10/0));//此处出错导致后面代码都无法执行
        System.out.println("3.计算开始结束");
    }
}
