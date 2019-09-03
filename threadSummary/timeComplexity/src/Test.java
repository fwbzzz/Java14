public class Test {
    public static void main(String[] args) {
        Ex ex = new Ex();
        System.out.println(ex.cal(2));
    }
}
class Ex{
    public int cal(int n) {
        int sum = 0;
        int i = 1;
        for (; i <= n; ++i) {
            sum = sum + i;
        }
        return sum;
    }
}
