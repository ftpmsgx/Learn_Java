package club.shawngao.monotonicsequence;

public class Main {

    /**
     * @author ShawnGao
     * @param args nullArray
     */
    public static void main(String[] args) {
	// write your code here
        int[] a = new int[]{1, 1, 2};
        if (a.length <= 2) {
            System.out.println(true);
        }
        boolean[] flag = new boolean[]{true, true};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                flag[0] = false;
            }
            if (a[i] < a[i + 1]) {
                flag[1] = false;
            }
        }
        System.out.println(flag[0] || flag[1]);
    }
}
