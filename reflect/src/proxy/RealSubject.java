package proxy;

class RealSubject implements ISubject {
    @Override
    public void eat() {
        System.out.println("饿了要吃饭") ;
    }
}