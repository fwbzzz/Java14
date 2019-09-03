import java.util.*;

/**
 * @program: mapTest
 * @description:
 * @author: fwb
 * @create: 2019-07-24 17:12
 **/
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"hello");
        map.put(2,"java");
        map.put(3,"hello");
        map.put(4,"fwb");
        map.put(4,"ffwwwbbbb");
        map.put(5,null);
        map.put(6,"哈哈");
        System.out.println(map.get(4));
        System.out.println(map.get(7));
        System.out.println(map);
        Set<Integer> keySet = map.keySet();//取得key信息，//key不能重复
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();//key
            System.out.println(i + "=" + map.get(i));
        }
    }
}
