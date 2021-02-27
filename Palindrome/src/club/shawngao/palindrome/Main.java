package club.shawngao.palindrome;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 121;
        if (x < 0) {
            return;
        }
        if (Math.abs(x) > Integer.MAX_VALUE / 10) {
            return;
        }
        int Test = x;
        int result = 0;
        while (x != 0) {
            int Temp = x % 10;
            x /= 10;
            result = result * 10 + Temp;
        }
        System.out.println(result == Test? "True": "False");
    }
}
