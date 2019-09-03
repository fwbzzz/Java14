package com.fwb.test;
/*
先打断点，之后点击爬虫
之后cmd 输入jps，之后点击向下运行按钮，之后jmap -histo:live 14472 > f:Test2.txt（14472位TestMain代号）
 */
import com.fwb.dao.CHeadSingleListImpl;
import com.fwb.dao.NoHeadSingleListImpl;

public class TestMain {
    //    public static void main(String[] args) throws InterruptedException {
//        DoubleLinkListImpl doubleLinkList = new DoubleLinkListImpl();
//        doubleLinkList.addFirst(18);
//        doubleLinkList.addFirst(78);
//        doubleLinkList.addFirst(99);
//        doubleLinkList.addLast(18);
//        doubleLinkList.display();
////        doubleLinkList.clear();
////        doubleLinkList.display();
//        System.out.println("**");
////        Thread.sleep(1000);
////        System.out.println("睡醒了");
//    }
//}
//
//    public static void main(String[] args) throws InterruptedException {
//        CHeadSingleListImpl cHeadSingleListmpl = new CHeadSingleListImpl();
//        cHeadSingleListmpl.addFirst(28);
//        cHeadSingleListmpl.addFirst(78);
//        cHeadSingleListmpl.addFirst(99);
//        cHeadSingleListmpl.addLast(18);
//        cHeadSingleListmpl.addIndex(1, 88);
//        cHeadSingleListmpl.addIndex(1, 88);
//        cHeadSingleListmpl.addLast(100);
//        cHeadSingleListmpl.display();
//        cHeadSingleListmpl.middleNode();
//    }
//}
//        System.out.println(cHeadSingleListmpl.FindKthToTail(3));
//        System.out.println(cHeadSingleListmpl.contains(178));
//        cHeadSingleListmpl.delete(99);
//        cHeadSingleListmpl.display();
//        cHeadSingleListmpl.deleteAllkey(88);
//        cHeadSingleListmpl.display();
//        cHeadSingleListmpl.clear();
//        cHeadSingleListmpl.display();
//        Thread.sleep(1000);
//        System.out.println("睡醒了");
//}
        public static void main(String[]args){
            NoHeadSingleListImpl mySingleList = new NoHeadSingleListImpl();
            mySingleList.addFirst(1);
            mySingleList.addFirst(2);
            mySingleList.addFirst(3);
            //mySingleList.addFirst();
            mySingleList.addFirst(2);
            mySingleList.addFirst(1);
            mySingleList.display();
            System.out.println(mySingleList.chkPalindrome());
//            System.out.println(mySingleList.findKthToTail(2));
//            NoHeadSingleListImpl.Node cur = mySingleList.partition(2);
//            mySingleList.show(cur);
//            System.out.println("**********************");
//            mySingleList.deleteAllkey(18);
//            mySingleList.display();
//            mySingleList.clear();
//            mySingleList.display();
//            System.out.println("***");
//            Thread.sleep(1000);
//            System.out.println("睡醒了");
        }
    }

//    public static void main(String[] args) {
//        SequenceImpl  = new SequenceImpl();
//        for (int i = 0; i < 10; i++) {
//            sequencsequencee.add(i, i);
//        }
//        sequence.delete(2);
//        sequence.display();
//    }
//}
