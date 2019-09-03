public class ternaryOperator {
    public static void main(String[] args) {
        if(1 > 2){
            System.out.println("1");
        }
        if(1<2|(3/5 == 3)) {
            System.out.println("条件满足1");
        }
        if(1<2||(3/5 == 3)){
            System.out.println("条件满足2");
        }
    }
}
