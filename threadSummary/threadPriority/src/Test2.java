///*
//查看main方法优先级
// */
//class MyThread2 extends Thread{

//    @Override
//    public void run() {
//        for(int i = 0;i <5;i++){
//            System.out.println(Thread.currentThread().getName() + "、" +i);
//        }
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName() + "、" +
//                Thread.currentThread().getPriority());
//    }
//}
