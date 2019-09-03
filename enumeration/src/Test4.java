/*
扩展枚举类的普通属性和构造方法，toString()
 */

//enum Color3实际就是class Color3 只是被特殊处理过
enum Color4 {
    //默认通过无参构造产生，此时定义了有参构造之后，必须给里面传参
    RED4("红"),BLUE4("蓝"),YELLOW4("黄");//当枚举类中还包括其他结构，枚举对象的定义必须放在首行
    private String title;//如果想修改名字，可以扩展一个普通的名称   ↓↓↓
    // 但是这三个是通过无参构造传入的，想将title传入需要有参构造
    private Color4(String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Color4 red4 = Color4.RED4;
        System.out.println(red4);
    }
}
