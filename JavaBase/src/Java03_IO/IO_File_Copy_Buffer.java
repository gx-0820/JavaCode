package Java03_IO;

import java.io.*;

/*
    文件复制 - 缓冲
 */
public class IO_File_Copy_Buffer {
    public static void main(String[] args) {

        // 数据源文件对象
        File srcFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt");
        // 数据目的地文件对象（自动生成）
        File destFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt.copy");

        // 文件输入流（管道对象）
        FileInputStream in = null;
        // 文件输出流（管道对象）
        FileOutputStream out = null;

        // 缓冲输入流（管道对象）
        BufferedInputStream buffIn = null;
        // 缓冲输出流（管道对象）
        BufferedOutputStream buffOut = null;

        // 缓冲区（水桶）
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);


            // 打开阀门，流转数据
            // ********************关键代码********************
            int data = -1;
            while ((data = buffIn.read(cache)) != -1) {
                buffOut.write(in.read(cache, 0, data));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
