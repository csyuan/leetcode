package leetcode;

/**
 * Created by slyuan on 17-4-7.
 */
public class MinPathSum {

    public static int minPathSum(int[][] m) {
        if(m == null || m.length == 0 || m[0] == null ||m[0].length == 0) {
            return 0;
        }
        int row = m.length;
        int col = m[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = m[0][0];
        for(int i = 1; i < col; i++) {
            dp[0][i] = dp[0][i-1] + m[0][i];

        }

        for(int j = 1; j < row; j++) {
            dp[j][0] = dp[j-1][0] + m[j][0];
        }

        for(int i = 1; i < row; i++) {
            for(int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + m[i][j];
            }
        }

        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        System.out.println(minPathSum(arr));
    }
}
