package club.shawngao.RD;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{1, 1, 2};
        int i = 0, j = 0;
        if (nums.length <= 1) {
            System.out.println("Null");
            return;
        }
        for (; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        System.out.print(j + 1);
    }
}
