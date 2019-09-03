///*
//取得该类的Class对象的三种方法
// */
//import java.util.Date;
//public class Test1 {
//    public static void main(String[] args) throws ClassNotFoundException {
//        //正向处理
//        Date date = new Date();
//        //1.调用Object提供的getClass()方法
//        Class<Date> cls = (Class<Date>) date.getClass();//取得Date类的Class对象
//        System.out.println(cls);
//        //2. 类名称.Class
//        System.out.println(Date.class);
//        //3.调用Class类提供的静态方法Class.forName（类的全名称）；
//        Class cls1 = Class.forName("java.util.Date");//此处有受查异常，需要强制异常处理（ClassNotFoundException）
//        System.out.println(cls1);
//    }
//}
