
class Sync6{
    //线程一
    public synchronized void testA(){
        while(true){
            testB();
        }
    }
    //线程1能否调用testB()：能，拿到到锁以后为所欲为
    //线程2能否进入testB()：不能，只能等到A结束以后，但是A死循环
    public synchronized void testB(){}
}
//
public class Test6 {
}
