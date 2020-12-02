package club.shawngao.fileproperties;

import java.util.Date;
import java.util.Scanner;
import java.io.File;

public class Main {

    /**
     * 检测指定文件是否存在，存在则输出文件信息
     */
    private static String fileName;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要查看的文件名以及文件所在的绝对路径：");
        fileName = sc.next();
        File file = new File(fileName);
        if(file.exists()) {
            if(file.isDirectory()) {
                System.out.print("\n\033[31m这是个目录\n");
            }
            else {
                properties();
            }
        }
        else {
            System.out.print("\n\033[31m没有名为\""+fileName+"\"的文件或目录\n");
        }
    }

    /**
     * 输出文件信息
     */
    private static void properties() {
        File file = new File(fileName);
        System.out.print("\n\033[32m文件存在\n");
        System.out.print("\n\033[32m这个文件的信息如下：\n");
        System.out.println("文件名："+ file.getName());
        System.out.println("绝对路径："+ file.getPath());
        System.out.println("是否为隐藏文件："+ file.isHidden());
        System.out.println("是否为标准文件："+ file.isFile());
        System.out.println("最后修改时间："+ new Date(file.lastModified()));
        System.out.println("文件长度："+ file.length());
        System.out.println("是否可读："+ file.canRead());
        System.out.println("是否可写："+ file.canWrite());
    }
}
