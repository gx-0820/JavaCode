package Java02_Collection;

import java.util.ArrayList;

/*
    ArrayList常用方法
 */
public class List_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        // add(位置，数据)
        list.add(1, "D");

        ArrayList otherList = new ArrayList();

        otherList.add("1");
        otherList.add("2");
        otherList.add("3");

        list.addAll(otherList);

        // 清空集合中的数据
//        list.clear();

        // 删除指定集合中的数据
        list.removeAll(otherList);

        // 判断集合中的数据是否为空
        System.out.println(list.isEmpty());

        // 判断集合中是否存在某条数据，返回boolean类型
        System.out.println(list.contains("A"));

        // indexOf获取数据在索引中的第一个位置,若不存在返回-1
        // lastIndexOf获取数据在索引中的最后一个位置,若不存在返回-1
        System.out.println(list.indexOf("C"));
        System.out.println(list.lastIndexOf("C"));

        // 集合转数组
        Object[] objects = list.toArray();

        // 复制新集合
        Object clone = list.clone();
        ArrayList cloneList = (ArrayList)clone;

        System.out.println(cloneList);
        System.out.println(list);

    }
}
