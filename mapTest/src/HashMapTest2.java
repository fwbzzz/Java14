import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: mapTest
 * @description: Map输出
 * @author: fwb
 * @create: 2019-07-25 14:54
 **/
public class HashMapTest2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"java");
        map.put(3,"hello");
        map.put(4,"fwb");
        map.put(4,"ffwwwbbbb");
        map.put(null,null);
        map.put(null,"哈哈");
        // map -> set
        // map标准输出
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
