import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: mapTest
 * @description: 单机版MapReduce
 * @author: fwb
 * @create: 2019-07-25 17:17
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Java","python","C++","JavaScript");
        //返回list集合中带Java关键字的关键字的个数
        System.out.println(list.stream().filter((e) -> e.contains("Java")).count());
        //返回list集合中带Java关键字的关键字的个数,并形成新的List集合
        List<String> resultList =  list.stream().
                filter((e -> e.contains("Java"))).
                collect(Collectors.toList());
        System.out.println(resultList);
    }
}
