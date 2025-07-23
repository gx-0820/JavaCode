package Java02_Collection;

import java.util.HashSet;

/*
    HashSet基本操作和常用方法
 */
public class Set {
    public static void main(String[] args) {

        // HashSet
        // Hash : 哈希算法，散列算法
        // ArrayList : 数组
        // LinkedList : 链表
        HashSet hs = new HashSet();

        // 增加数据
        hs.add("zhangsan");
        hs.add("lisi");
        hs.add("wangwu");

        // 修改数据

        // 删除数据
        hs.remove("zhangsan");

        // 查询数据
        for (Object o : hs) {
            System.out.println(o);
        }

        System.out.println(hs);

    }
}
