package club.shawngao.AOD;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{1,2,2,3,1,4,2};
        int len = nums.length;
        int[] Size = new int[50000];
        int Max = 0;
        for (int i : nums) {
            Size[i]++;
            Max = Math.max(Max, Size[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Size[i]);
        }
        Size = new int[50000];
        int TailPointer = -1, HeadPointer = 0, result = Integer.MAX_VALUE;
        while (HeadPointer < len) {
            int v = nums[HeadPointer];
            Size[v]++;
            boolean flag = false;
            while (Size[v] == Max) {
                TailPointer++;
                Size[nums[TailPointer]]--;
                flag = true;
            }
            if (flag) {
                result = Math.min(result, HeadPointer - TailPointer + 1);
            }
            HeadPointer++;
        }
        System.out.println(result);
    }
}
