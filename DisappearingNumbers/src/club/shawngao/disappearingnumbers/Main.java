package club.shawngao.disappearingnumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums = new int[]{1, 5};
        ArrayList<Integer> result = new ArrayList<>();
        if (nums.length < 2) {
            System.out.println("Error");
            return;
        }
        int i, j, k;
        Arrays.sort(nums);
        int num=1;
        for (i=0; i < nums.length; i++){
            if (nums[i]==num) {
                num++;
            }
            if (nums[i]>num) {
                result.add(num++);
                i--;
            }
        }
        while (num <= nums.length) {
            result.add(num++);
        }
        System.out.println(result);
    }
}
