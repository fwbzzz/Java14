//import javax.swing.*;
//
///*
//反射的意义之一，通过简单工厂模式证明(电脑有太多种一个一个加过与麻烦)
// */
//interface IComputer{
//    void buyComputer();
//}
//
//class Macbook implements IComputer{
//    @Override
//    public void buyComputer() {
//        System.out.println("买一台苹果电脑");
//    }
//}
//class Surface implements IComputer{
//    @Override
//    public void buyComputer() {
//        System.out.println("买一台微软电脑");
//    }
//}
//
//class Alienware implements IComputer{
//    @Override
//    public void buyComputer() {
//        System.out.println("买一台外星人电脑");
//    }
//}
//
//class ComputerFactory{
//    public static IComputer getInstance(String computerName){
//        if(computerName.equals("mac")){
//            return new Macbook();
//        }else if(computerName.equals("surface")){
//            return new Surface();
//        }else if(computerName.equals("alien")){
//            return new Alienware();
//        }
//        return null;
//    }
//}
//
//public class Test3 {
//    public static void main(String[] args) {
//        IComputer computer = ComputerFactory.getInstance("Alien");
//        computer.buyComputer();
//    }
//}
