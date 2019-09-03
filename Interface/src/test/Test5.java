package test;
//定义 标准，规范
interface USB{
    void setUp();
    void work();
}

class Computer{
    //电脑使用USB标准，识别实现了USB接口的类
    public void plugIn(USB sub){
        sub.setUp();
        sub.work();
    }
}

class UDisk implements USB{
    @Override
    public void setUp() {
        System.out.println("U盘安装驱动ing...");
    }

    @Override
    public void work() {
        System.out.println("U盘正常使用");
    }
}

class KeyBoard implements USB{
    @Override
    public void setUp() {
        System.out.println("键盘安装驱动");
    }

    @Override
    public void work() {
        System.out.println("键盘正常安装");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugIn(new UDisk());
        computer.plugIn(new KeyBoard());
    }
}
