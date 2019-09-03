/*
枚举实现接口
 */
interface IColor {
    String getTitle5();//由于这个方法被覆写，那么枚举类中的这三个对象就自动变成了ICOlor()对象
}

enum Color5 implements IColor {
    //默认通过无参构造产生，此时定义了有参构造之后，必须给里面传参
    RED5("红"),BLUE5("蓝"),YELLOW5("黄");//当枚举类中还包括其他结构，枚举对象的定义必须放在首行
    private String title5;//如果想修改名字，可以扩展一个普通的名称   ↓↓↓
    // 但是这三个是通过无参构造传入的，想将title传入需要有参构造
    private Color5(String title5){
        this.title5 = title5;
    }
    public String toString(){
        return this.title5;
    }

    public String getTitle5() {
        return title5;
    }
}
public class Test5 {
    public static void main(String[] args) {
      IColor color5 = Color5.RED5;//此时这个枚举对象就自动向上转型变成了接口对象
        System.out.println(color5.getTitle5());
    }
}
