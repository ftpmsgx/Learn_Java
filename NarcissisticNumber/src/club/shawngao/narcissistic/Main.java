package club.shawngao.narcissistic;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if(isNarcissisticNumber(num))
            System.out.println("This number is a Narcissistic number.");
        else
            System.out.println("This number is not a Narcissistic number.");
    }
    private static boolean isNarcissisticNumber(int n){
        boolean flag;
        int num1 = n % 10;
        int num2 = n / 10 % 10;
        int num3 = n / 100;
        int sum;
        sum = (int)Math.pow(num1, 3)+(int)Math.pow(num2, 3)+(int)Math.pow(num3, 3);
        flag = sum == n;
        return flag;
    }
}
