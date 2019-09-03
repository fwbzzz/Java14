/*
为什么需要枚举
定义一个描述颜色的多例类(表示有限个数的对象的类)，
构造方法私有化以后在类的内部提供对象
但是如果对象过分多则会很麻烦                           000
 */
class Color{
    private String name;//在多例中标识对象
    //首先构造方法私有化
    private static Color RED = new Color("Red");
    private static Color YELLO = new Color("Yello");
    private static Color BLUE = new Color("Blue");
    private Color(String name){
        this.name = name;
    }

    public static Color getInstance(String colorName){
        switch(colorName){
            case "Red":
                return RED;
            case "Yello":
                return YELLO;
            case "Blue":
                return BLUE;
            default:
                return null;
        }
    }
    //覆写toString,为了直接输出名字
//    public String toString(){
//        return this.name;
//    }
}

public class Test1 {
    public static void main(String[] args) {
        Color red = Color.getInstance("Red");
        Color blue = Color.getInstance("Blue");
        Color green = Color.getInstance("Green");
        System.out.println(red);
        System.out.println(blue);
    }
}
