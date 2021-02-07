package club.shawngao.shellsort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void ShellSort(ArrayList<Integer> num) { // Shell Sort method begin
        int len = num.size(); // Calculator ArrayList's Length
        for (int i = len / 2; i > 0; i /= 2) {
            for (int j = i; j < len; j++) {
                for (int k = j - i; k >= 0 && num.get(k) > num.get(k + i); k -= i) {
                    num.set(k, Swap(num.get(k + i), num.set(k + i, num.get(k))));
                }
            }
        }
    }

    public static int Swap(int a, int b) { // Swap Method
        // Usage : y = Swap(x, x = y);
        return a;
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
