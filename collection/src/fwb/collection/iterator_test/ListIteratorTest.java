package fwb.collection.iterator_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("hello");
        list.add("fwb");

        System.out.println("1. 使用迭代器输出:");
        Iterator<String> iterator = list.iterator();//取得迭代器
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("2. 使用foreach:");
        for (String str: list
                ) {
            System.out.println(str);
        }

        System.out.println("-------------------------");
        System.out.println("3. 双输出，只有list接口有");
        ListIterator<String> iterator2 = list.listIterator();
        System.out.println("正向：");
        while(iterator2.hasNext()){
            String str = iterator2.next();
            System.out.println(str);
        }
        System.out.println("反向：");
        while (iterator2.hasPrevious()){
            String str = iterator2.previous();
            System.out.println(str);
        }
    }
}