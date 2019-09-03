///*
//这种模式最大的问题在于，每当有新的产品产生，均需要修改客户端的源代码才能支持新产品
// */
//
//package fac;
//
////定义一个标准，到底啥算电脑
//interface Computer{
//    void printRealComputer();//子类只需要复写这个方法告诉当前这个电脑是啥
//}
//
////客户端，买东西
//class Client{
//    //具体买啥还不知道所以传入一个computer的接口
//    public void buyComputer(Computer computer){
//        computer.printRealComputer();
//    }
//}
//
////MacBook这个类实现了compu这个接口，表示他可以被用户所购买
//class MacbookPro implements Computer{
//    @Override
//    public void printRealComputer() {
//        System.out.println("买一个苹果电脑");
//    }
//}
//
//class SurfaceBook implements Computer{
//    @Override
//    public void printRealComputer() {
//        System.out.println("买一台微软电脑");
//    }
//}
//
//class AlienWare implements Computer{
//    public void printRealComputer(){
//        System.out.println("买一台外星人");
//    }
//}
//
//public class Fac1 {
//    //客户端（将主方法称为客户端）
//    public static void main(String[] args) {
//        Client client = new Client();
//        client.buyComputer(new MacbookPro());
//    }
//}
//
