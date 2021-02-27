package club.shawngao.angrybookstoreowner;

/**
 * @Author: ShawnGao高新
 * @Date: 2021/2/27 20:23
 */

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] customers = new int[]{4,10,10};
        int[] grumpy = new int[]{1,1,0};
        int result = 0;
        int max = 0;
        int temp = 0;
        int x = 2;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i]==0) {
                result += customers[i];
                customers[i] = 0;
            }
        }
        for (int i = 0; i < x; i++) {
            max += customers[i];
        }
        temp = Math.max(temp, max);
        for (int i = x; i < customers.length; i++) {
            max = max+customers[i]-customers[i-x];
            temp = Math.max(temp, max);
        }
        System.out.println(result + temp);
    }
}
