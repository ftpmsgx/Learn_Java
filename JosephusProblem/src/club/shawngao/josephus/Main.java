package club.shawngao.josephus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean[] l = new boolean[101];
        int i;
        for(i = 0; i < l.length; i++) {
            l[i] = false;
        }
        /*
         * peoPle   人数
         * num      基数
         * die      死的人数
         * subScript    位置/下标
         * count    计数器
         */
        int peoPle, num, die = 0, subScript = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入人数和基数：");
        peoPle = sc.nextInt();
        num = sc.nextInt();
        do {
            subScript++;
            if(subScript > peoPle) {
                subScript = 1;
            }
            if(!l[subScript]) {
                count++;
            }
            if(count == num) {
                count = 0;
                System.out.print("  " + subScript + "  ");
                l[subScript] = true;
                die++;
            }
        } while (die != peoPle - 1);
    }
}
