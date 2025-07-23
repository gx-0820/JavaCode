package Java02_Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class List_Sort {
    public static void main(String[] args) {

        // sort排序
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(3);
        list.add(2);

        // 排序需要传递一个实现了比较器接口的对象
        list.sort( new NumberComparator() );

        System.out.println(list);
    }
}

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // 第一个数比第二个数大，返回结果为正数，表示升序
        return o1 - o2;
        // 第一个数比第二个数小，返回结果为负数，表示降序
//        return o2 - o1;
        // 第一个数和第二个数一样大，返回结果为0
//        return 0;
    }
}