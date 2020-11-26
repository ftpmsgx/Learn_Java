package club.shawngao.binarysearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i,result = 0;
        int hkey;
        int start = 0, end = 9;
        System.out.print("输入十个数:");
        for(i = 0; i <= 9; i++)
            a[i] = sc.nextInt();
        System.out.print("输入要查找的数：");
        hkey = sc.nextInt();
        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(a[mid] > hkey)
                end = mid - 1;
            else if(a[mid] < hkey)
                start = mid + 1;
            else {
                result = mid;
                break;
            }
        }
        System.out.println("Result:" + result);
    }
}
