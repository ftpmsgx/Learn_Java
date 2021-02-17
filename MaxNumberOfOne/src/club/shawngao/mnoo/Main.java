package club.shawngao.mnoo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        int Count = 0;
        int MaxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                Count++;
                continue;
            }
            MaxCount = Math.max(Count, MaxCount);
            Count = 0;
        }
        MaxCount = Math.max(Count, MaxCount);
        System.out.println(MaxCount);
    }
}
