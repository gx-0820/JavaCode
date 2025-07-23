package Java03_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_File_Copy_String {
    public static void main(String[] args) {

        // 数据源文件对象
        File srcFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt");
        // 数据目的地文件对象（自动生成）
        File destFile = new File("C:\\Project\\JavaCode\\JavaBase\\data\\word.txt.copy");

        // 文件输入流（管道对象）
        FileInputStream in = null;
        // 文件输出流（管道对象）
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            // 打开阀门流转数据（输入）
            int data = -1;

            StringBuilder ss = new StringBuilder();

            while ( (data = in.read()) != -1 ) {
//                System.out.println(data + 1);
//                out.write(data + 1);
                ss.append((char) data);
            }

            ss.append("zhangsan");
            System.out.println(ss);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
