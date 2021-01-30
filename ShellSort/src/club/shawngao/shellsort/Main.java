package club.shawngao.shellsort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void ShellSort(ArrayList<Integer> num) {
        int tmp;
        for (int i = num.size() / 2; i >= 1; i /= 2) {
            for (int j = i; j < num.size(); j++) {
                tmp = num.get(j);
                int k = j - i;
                while (k >= 0 && num.get(k) > tmp) {
                    num.set(k + i, num.get(k));
                    k -= i;
                }
                num.set(k + i, tmp);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int len;
        System.out.print("Enter Number of digits:");
        len = sc.nextInt();
        System.out.print("Enter Numbers:");
        for (int i = 0; i < len; i++) {
            arr.add(sc.nextInt());
        }
        ShellSort(arr);
        System.out.println(arr);
    }
}
