
///*
//死锁，
// */
//public class Test3 {
//    private static Pen pen = new Pen();
//    private static Book book = new Book();
//    public static void main(String[] args) {
//        Thread threadA = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (pen){
//                    System.out.println(Thread.currentThread().getName() + " 我有笔，没有本");
//                    synchronized (book){
//                        System.out.println(Thread.currentThread().getName() + " 我有本，也有笔");
//                    }
//                }
//            }
//        },"ThreadA");
//        Thread threadB = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (book){
//                    System.out.println(Thread.currentThread().getName() + " 我有本，没有笔");
//                    synchronized (pen){
//                        System.out.println(Thread.currentThread().getName() + " 我有笔，也有本");
//                    }
//                }
//            }
//        },"ThreadB");
//        threadA.start();
//        threadB.start();
//    }
//}
//
//class Pen{
//    private String name = "笔";
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Book{
//    private String name = "本子";
//
//    public String getName() {
//        return name;
//    }
//}