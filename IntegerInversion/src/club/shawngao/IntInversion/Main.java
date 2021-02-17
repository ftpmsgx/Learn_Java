package club.shawngao.IntInversion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 123;
        int Temp, result = 0;
        while (x != 0) {
            Temp = x % 10;
            x /= 10;
            if (Math.abs(result) > Integer.MAX_VALUE / 10) {
                return;
            }
            result = result * 10 + Temp;
        }
        System.out.println(result);
    }
}
