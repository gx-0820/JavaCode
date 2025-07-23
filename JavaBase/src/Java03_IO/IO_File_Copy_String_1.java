package Java03_IO;

import java.io.*;

/*
    文件复制 - 字符流
 */
public class IO_File_Copy_String_1 {
    public static void main(String[] args) {

        // 数据源文件对象
        File srcFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt");
        // 数据目的地文件对象（自动生成）
        File destFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt.copy");

        // 字符输入流（管道对象）
        BufferedReader reader = null;
        // 字符输出流（管道对象）
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

            // 打开阀门流转数据（输入）
            // 读取文件中的一行数据
            String line = null;

            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
                writer.println(line);
            }

            // 刷写数据
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
