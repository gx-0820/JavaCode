package Java01_Base;

public class Array {
    public static void main(String[] args) {
        /*
        数组练习
         */
        nine(9);// 九层妖塔

        /*
        字符串练习
         */

    }

    // 数组练习 - 九层妖塔
    /*
        *
       ***
      *****
     *******

     */
    static void nine(int level) {
        int a = 2 * (level - 1) + 1;// 列
        String[][] arr = new String[level][a];

        for (int i = 0; i < level; i++) {
            for (int j = 0; j < a; j++) {
                if (j >= (level -1) - i && j <= (level -1) + i) {
                    arr[i][j] = "*";
                }else {
                    arr[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


}
