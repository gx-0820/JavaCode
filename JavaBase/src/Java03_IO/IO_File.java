package Java03_IO;

import java.io.File;
import java.io.IOException;

/*
    文件流
 */
public class IO_File {
    public static void main(String[] args) throws IOException {

        // 创建文件对象，使用文件路径关联系统文件
        String filePath = "C:\\Project\\JavaCode\\JavaBase\\data\\word.txt";
        File file = new File(filePath);
        System.out.println(file);

        // 文件对象的操作
//        // 判断当前文件对象是否为文件
//        System.out.println(file.isFile());
//        // 判断当前文件对象是否为文件夹
//        System.out.println(file.isDirectory());
//        // 判断文件对象是否存在关联
//        System.out.println(file.exists());

        if (file.exists()) {
            System.out.println("文件存在");
            if (file.isFile()) {
                System.out.println("文件对象关联的是一个文件");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsoluteFile());
            } else if (file.isDirectory()) {
                System.out.println("文件对象关联的是一个文件夹");
                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsoluteFile());

                String[] files = file.list();
                System.out.println("文件夹中的文件：");
                for (String f : files) {
                    System.out.println(f);
                }
            }
        } else {
            System.out.println("文件不存在");
            // 创建多级文件目录
//            file.mkdir();
            // 创建新文件
            file.createNewFile();

        }
    }
}
