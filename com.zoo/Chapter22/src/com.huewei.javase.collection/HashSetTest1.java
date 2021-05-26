import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：
    无序不可重复。
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();

        // 添加元素
        strs.add("郭子");
        strs.add("红子");
        strs.add("耀子");
        strs.add("付子");
        strs.add("旭子");
        strs.add("阳子");

        // 遍历
        /*
        郭子
        红子
        耀子
        付子
        旭子
        阳子
        1、存储时顺序和取出的顺序不同。
        2、不可重复。
        3、放到HashSet集合中的元素实际上是放到HashMap集合的key部分了。
         */

        for (String data : strs) {
            System.out.println(data);
        }
    }
}
