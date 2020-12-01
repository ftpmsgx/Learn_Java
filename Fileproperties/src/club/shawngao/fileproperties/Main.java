package club.shawngao.fileproperties;

import java.util.Date;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要查看的文件名以及文件所在的绝对路径：");
        String fileName;
        fileName = sc.next();
        File file = new File(fileName);
        if(file.exists()) {
            if(file.isDirectory()) {
                System.out.print("\n\033[32m目录存在\n");
            }
            else {
                System.out.print("\n\033[31m这不是个目录\n");
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
        else {
            System.out.print("\n\033[31m没有那个文件或目录\n");
        }
    }
}
