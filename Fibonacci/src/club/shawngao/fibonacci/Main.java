package club.shawngao.fibonacci;

import java.util.Scanner;

public class Main {

    /**
     * 输出指定元素个数的斐波那契数列
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i;
        System.out.print("输入想输出斐波那契数列的元素个数(num < 92)：");
        num = sc.nextInt();
        if(num < 92) {
            for (i = 1; i <= num; i++) {
                System.out.printf("%20d", fibonacci(i));
                if (i % 5 == 0)
                    System.out.println(" ");
            }
        }
        else {
            System.out.print("\n\033[31m U0001 Out of INT DATASIZE\n");
        }
    }

    /**
     * 使用递归来计算斐波那契的项
     */
    private static int fibonacci(int number) {
        if(number == 1 || number == 2)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
