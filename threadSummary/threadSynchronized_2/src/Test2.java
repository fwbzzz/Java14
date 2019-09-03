///*
//锁粗化
//锁粗化就是将多次连接在一起的加锁、解锁操作合并为一次，将多个连续的锁扩展成为一个范围更大的锁。
// */
//public class Test2 {
//    private static StringBuffer sb = new StringBuffer();
//    public static void main(String[] args) {
////        sb.append("a");
////        sb.append("b");
////        sb.append("c");
//        StringBuilder builder = new StringBuilder();
//        builder.append("a");
//        builder.append("b");
//        builder.append("c");
//
//        //加锁，解锁一次
//        sb.append(builder.toString());
//
//    }
//}
