package club.shawngao.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num = rd.nextInt(100)+1;
        int i = 0;
        int n = 0;
        while(n != num) {
            System.out.print("请猜数字：");
            n = sc.nextInt();
            if(n > num)
                System.out.println("猜的数字太大了");
            else if(n == num)
                System.out.println("猜中了");
            else
                System.out.println("猜的数字太小了");
            i++;
        }
        System.out.println("总共猜了"+i+"次");
    }
}
