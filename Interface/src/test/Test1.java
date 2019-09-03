/*
介绍接口
 */
package test;

interface IMessage{
    public static final String MSG = "java";//全局常量，常量全大写，多个单词下划线，常量在声明时赋值（JDK8以前）
    public abstract void print();//使用abstruct关键字来定义，并且没有方法体
    /////////接口中只有这两东西
}
interface INews{
    public abstract String getMsg();
}

class MessageImpl implements IMessage,INews{
    public void print(){
        System.out.println(MSG);
    }
    public String getMsg(){
        return IMessage.MSG;
    }
}

public class Test1 {
    public static void main(String[] args) {
	IMessage msg = new MessageImpl();
	msg.print();//只能使用Imessage定义的方法
    INews news = (INews)msg;
    //(父接口的相互转换，和向下转型有点像，先找一个共同子类，建立联系)// INews news = new MessageImpl();
    news.getMsg();
    }
}
