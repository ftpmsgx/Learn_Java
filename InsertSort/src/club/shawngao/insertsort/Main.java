package club.shawngao.insertsort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void Sort(ArrayList<Integer> num, int len) {
        // Sort
        for (int i = 0; i <= len; i++) {
            for (int j = i; j > 0; j--) {
                if (num.get(j) < num.get(j - 1)) {
                    num.set(j - 1, Swap(num.get(j), num.set(j, num.get(j - 1))));
                } else {
                    break;
                }
            }
        }
    }

    public static int Swap(int a, int b) {
        return a;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int i, count;
        System.out.print("Enter Numbers' Count:");
        count = sc.nextInt();
        System.out.print("Enter Numbers:\n");
        for (i = 0; i <= count - 1; i++) {
            arr.add(sc.nextInt());
        }
        Sort(arr, count - 1);
        System.out.println(arr);
    }
}
