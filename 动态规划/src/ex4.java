import java.util.HashSet;
import java.util.Set;
import java.util.*;

/**
 * @program: 动态规划
 * @description: word-break
 * @author: fwb
 * @create: 2019-08-23 17:34
 **/
public class ex4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("52");
        System.out.println(wordBreak("1234567789",set));
        String s = "123456";
        boolean[] bool = new boolean[3];
        for(boolean bool1 : bool){
            System.out.println(bool1);
        }

    }

    public static boolean wordBreak(String s, Set<String> dict) {
        boolean[] bool = new boolean[s.length()+ 1];
        bool[0] = true;
        for(int i = 1; i <= s.length(); i++){
            //遍历之前的状态
            for(int j = 0; j < i; j++){
                if(bool[j] && dict.contains(s.substring(j,i))){
                    bool[i] = true;
                    break;
                }
            }
        }
        return bool[s.length()];
    }
}

