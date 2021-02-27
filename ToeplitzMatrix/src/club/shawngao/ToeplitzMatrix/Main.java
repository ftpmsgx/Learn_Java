package club.shawngao.ToeplitzMatrix;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};
        int row = matrix[0].length;
        int column = matrix.length;
        for (int i = 1; i < column; i++) {
            for (int j = 1; j < row; j++) {
                if (matrix[i - 1][j - 1] != matrix[i][j]) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
