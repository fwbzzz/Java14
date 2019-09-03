//package proxy;
//
//import java.lang.reflect.Constructor;
//
//public class TestSubject {
//    public static void main(String[] args){
//        ISubject realObject = new RealSubject();
//        ISubject proxyObject = new ProxySubject(realObject);
//        proxyObject.eat();
//    }
//
//    class IsubjectFactory{
//
//        public static ISubject getI
//    }
//
//    class ObjectFactory{
//        public static  <T> T getObject(Class classz){
//            try {
//                return (T) classz.newInstance();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//    }
//    public static <T> T getObject(Class classz , Object object){
//        try {
//            Constructor constructor = classz.getConstructor(classz.getInterfaces()[0]);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//    }
//}
