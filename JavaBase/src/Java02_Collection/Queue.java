package Java02_Collection;

import java.util.concurrent.ArrayBlockingQueue;

/*
    Queue基本操作
 */
public class Queue {
    public static void main(String[] args) {

        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);

        // 增加数据,如果add增加不了会报错
//        queue.add("zhangsan");
//        queue.add("lisi");
//        queue.add("wangwu");
//        queue.add("zhaoliu");// 报错，Queue full

        boolean zhangsan = queue.offer("zhangsan");
        System.out.println(zhangsan);
        boolean lisi = queue.offer("lisi");
        System.out.println(lisi);
        boolean wangwu = queue.offer("wangwu");
        System.out.println(wangwu);
        boolean zhangliu = queue.offer("zhangliu");
        System.out.println(zhangliu);

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());// 打印null

        // .put .take会阻塞
        System.out.println(queue);


    }
}
