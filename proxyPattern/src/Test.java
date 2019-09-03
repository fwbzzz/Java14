
//买东西
interface IBuy{
    void buyBuyBuy();
}

//真实主题类（付钱的人），可以有多个真实主题类
class RealSubject implements IBuy{
    @Override
    public void buyBuyBuy() {
        System.out.println("买一台mac");
    }
}

//代理类（代购）
//
class ProxySubject implements IBuy{
    //买的子类可能有很多个，如果传入一个具体子类，代码会被限制住，而传入接口则比较灵活（只要子类实现了这个接口，就都可以帮忙代购）
    private  IBuy buyer;
    //传入真实主题类，真实的操作由真实主题来完成（代购时，付钱还是由客户来付钱）
    public ProxySubject(IBuy buyer){
        this.buyer = buyer;
    }

    public void beforeBuy() {
        System.out.println("去店里排队");
    }

    public void buyBuyBuy(){
        this.beforeBuy();
        //真实主题类完成真实操作
        this.buyer.buyBuyBuy();
        this.afterBuy();
    }

    public void afterBuy(){
        System.out.println("发快递到用户手中");
    }
}

public class Test {
    public static void main(String[] args) {
        //在代理的构造方法中传入真实主题类
        IBuy buyer = new ProxySubject(new RealSubject());
        buyer.buyBuyBuy();
    }
}
