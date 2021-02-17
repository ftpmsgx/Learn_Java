package club.shawngao.RM;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] nums = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int x = nums.length;
        int y = nums[0].length;
        if (r * c != x * y) {
            return;
        } else {
            int[][] result = new int[r][c];
            for (int i = 0; i < x * y; i++) {
                result[i / c][i % c] = nums[i / y][i % y];
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("\t" + result[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}
