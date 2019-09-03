package fwb.collection.iterator_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: collection
 * @description:
 * @author: fwb
 * @create: 2019-07-24 15:42
 **/
public class ListIteratorTest2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("hello");
        list.add("fwb");
       // list.add("1998");
        Iterator<String> iterator = list.iterator();//取得迭代器
        while(iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("fwb")){
                list.remove(str);
               // iterator.remove();
            }
            System.out.println(str);
        }

    }
}
