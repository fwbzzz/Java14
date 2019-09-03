/*
工厂方法模式
 */
package fac;

//定义一个标准，到底啥算电脑
interface Computer{
    void printRealComputer();//子类只需要复写这个方法告诉当前这个电脑是啥
}

//客户端，买东西
class Client{
    //具体买啥还不知道所以传入一个computer的接口
    public void buyComputer(Computer computer){
        computer.printRealComputer();
    }
}

//MacBook这个类实现了compu这个接口，表示他可以被用户所购买
class MacbookPro implements Computer{
    @Override
    public void printRealComputer() {
        System.out.println("买一个苹果电脑");
    }
}

class SurfaceBook implements Computer{
    @Override
    public void printRealComputer() {
        System.out.println("买一台微软电脑");
    }
}

class AlienWare implements Computer{
    public void printRealComputer(){
        System.out.println("买一台外星人");
    }
}

//抽象工厂接口（将简单工厂模式的工厂类，变为一个接口）
interface ComputerFactory{
    Computer createComputer();
}

//具体工厂类-生产苹果公司电脑
class AppleFactory implements ComputerFactory{
    //方法覆写
    public Computer createComputer(){
        return new MacbookPro();
    }
}

//具体工厂类-生产微软公司电脑
class MsFactory implements ComputerFactory{
    //方法覆写
    public Computer createComputer(){
        return new SurfaceBook();
    }
}


public class FacMethod {
    //客户端
    public static void main(String[] args) {
        ComputerFactory computerFactory = new AppleFactory();
        Client client = new Client();
        client.buyComputer(computerFactory.createComputer());
    }
}

