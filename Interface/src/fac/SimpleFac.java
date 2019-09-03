///*
//简单工厂模式
// */
//package fac;
//
//import java.util.Scanner;
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
////工厂类
//class ComputerFactory{
//    //一种工具方法
//    public static Computer getInstance(String computerName){
//        if(computerName.equals("mac")){
//            return new MacbookPro();
//        }else if(computerName.equals("surface")){
//            return new SurfaceBook();
//        }else if(computerName.equals("alien")){
//            return new AlienWare();
//        }
//        return null;
//    }
//}
//
//public class SimpleFac {
//    //客户端（将主方法称为客户端），若果需要加入新的商品，主客户端不用变只需在工厂类中加:
////    else if(computerName.equals("alien")){
////        return new AlienWare();
////    }
//    public static void main(String[] args) {
//        Client client = new Client();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您要购买的电脑型号...");
//        String computerName = scanner.nextLine();
//        Computer computer = ComputerFactory.getInstance(computerName);
//        client.buyComputer(computer);
//    }
//}
//
