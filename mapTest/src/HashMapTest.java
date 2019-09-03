import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: mapTest
 * @description:
 * @author: fwb
 * @create: 2019-07-24 17:12
 **/
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"java");
        map.put(3,"hello");
        map.put(4,"fwb");
        map.put(4,"ffwwwbbbb");
        map.put(null,null);
        map.put(null,"哈哈");
        System.out.println(map.get(4));
        System.out.println(map.get(7));
        System.out.println(map);
        System.out.println(map.get(null));
        Set<Integer> keySet = map.keySet();//取得key信息，//key不能重复
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Integer i = iterator.next();//key
            System.out.println(i + "=" + map.get(i));
        }
    }
}
