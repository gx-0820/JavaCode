package Java01_Base;

public class FlowControl {
    public static void main(String[] args) {
        // 流程控制练习 - 九层妖塔
        /*
                *
               ***
              *****
             *******

         */

        // print 和 println，前者不换行，后者换行

        int level = 9;// 层数
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < (level-1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
