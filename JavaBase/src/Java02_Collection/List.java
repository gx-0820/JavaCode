package Java02_Collection;

import java.util.ArrayList;

/*
    ArrayList基本操作
 */
public class List {
    public static void main(String[] args) {

        // 创建第一个集合对象：ArrayList
        ArrayList list = new ArrayList(3);

        // 增加数据
        // 添加数据时，如果集合中没有任何数据，那么底层会创建长度为10的数组
        // 超数组长度，会新建新数组
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // 获取集合中的条数
        System.out.println(list.size());

        // 获取指定位置的数据，可以采用索引的方式
        System.out.println(list.get(1));

        // 遍历集合中的数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中的数据：" + list.get(i));
        }

        // 如果循环遍历集合数据时，不关心数据位置，那么可以采用特殊的for循环
        for ( Object o : list ) {
            System.out.println("集合中的数据：" + o);
        }

        // 将指定位置的数据进行修改，set(数据位置,修改的值)
        // 方法会返回结果，这个结果就是更新前的值
        Object oldVal = list.set(0, "E");
        System.out.println("修改前的值：" + oldVal);

        // 将指定位置的数据进行删除，remove(数据位置)
        // 方法会返回结果，这个结果就是删除的值
        Object removeVal = list.remove(0);
        System.out.println("删除的值：" + removeVal);

        // 打印集合对象
        System.out.println(list);
    }
}
