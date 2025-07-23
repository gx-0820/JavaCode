package Java02_Collection;

import java.util.LinkedList;

/*
    LinkedList链表基本操作
 */
public class List_LinkedList {
    public static void main(String[] args) {
        // 构建集合对象
        LinkedList list = new LinkedList();

        // 增加第一个数据
        list.add("a");
        list.addFirst("b");
        list.add(1,"c");

        // 获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 遍历集合中的数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中的数据：" + list.get(i));
        }

        for ( Object o : list ) {
            System.out.println("集合中的数据：" + o);
        }

        // 修改数据
        list.set(1,"d");

        // 删除数据
        list.remove("d");

        // 获取第一个数据
        list.element();

        // 打印集合数据
        System.out.println(list);

    }
}
