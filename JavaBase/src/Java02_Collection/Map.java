package Java02_Collection;

import java.util.HashMap;
import java.util.Set;

/*
    HashMap基本操作和常用方法
 */
public class Map {
    public static void main(String[] args) {

        // HashMap
        // 数据存储是无序
        HashMap map = new HashMap();

        // 添加数据：put
        // 修改数据：put方法也可以修改数据，返回值就是被修改的值
        map.put("A", 1);
        System.out.println(map.put("A",4));
        map.put("B", 2);
        map.put("C", 3);

        // 删除数据
        map.remove("A");

        // 获取map集合中所有的key
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(map.get(key));
        }



        System.out.println(map);
    }
}
