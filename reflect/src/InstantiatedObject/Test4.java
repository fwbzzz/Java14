/*
用反射解决问题
 */
interface IComputer4{
    void buyComputer4();
}

class Macbook4 implements IComputer4{
    @Override
    public void buyComputer4() {
        System.out.println("买一台苹果电脑");
    }
}
class Surface4 implements IComputer4{
    @Override
    public void buyComputer4() {
        System.out.println("买一台微软电脑");
    }
}

class Alienware4 implements IComputer4{
    @Override
    public void buyComputer4() {
        System.out.println("买一台外星人电脑");
    }
}
//此时新加一类，工厂类并不需要变化，因为此时工厂类中并没有具体的东西，
// 只要传进来的类名称存在，一定就可以取得他的Class对象，进而产生实例
class Lenovo implements IComputer4{
    @Override
    public void buyComputer4() {
        System.out.println("买一台联想");
    }
}

class ComputerFactory4 {
    public static IComputer4 getInstance4(String computerClass4) {
        try {
            Class<?> cls = Class.forName(computerClass4);//取得Class对象
            IComputer4 computer4 = (IComputer4) cls.newInstance();
            return computer4;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Test4 {
    public static void main(String[] args) {
        IComputer4 computer4 = ComputerFactory4.getInstance4("Lenovo");
        computer4.buyComputer4();
    }
}
