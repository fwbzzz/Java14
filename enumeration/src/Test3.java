/*
枚举类的方法练习
 */
enum Color3 {
    RED3,BLUE3,YELLOW3
}
public class Test3 {
    public static void main(String[] args) {
        Color3 red3 = Color3.RED3;
        //ordinal()方法返回他的枚举编号，name()方法返回枚举名称(默认与对象名称保持一致)
        System.out.println(red3.ordinal() + " = " + red3.name());
        //values()返回所有枚举对象
        Color3[] colors = Color3.values();
        for (Color3 color3:colors) {
            System.out.println(color3);
        }
    }
}
