//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @program: jvmTest
// * @description: 堆溢出，对象太多内存不够
// * @author: fwb
// * @create: 2019-07-25 20:05
// **/
//public class Test3 {
//    static class OOMObject{}
//    public static void main(String[] args) {
//        List<OOMObject> list = new ArrayList<OOMObject>();
//        while(true)
//            list.add(new OOMObject());
//    }
//}
