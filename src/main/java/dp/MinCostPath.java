package dp;

import java.util.Arrays;

public class MinCostPath {
    public int getMinCost(int[][] matrix){
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==0 && j==0){
                    dp[i][j] = matrix[0][0];
                } else if (i==0 && j>0){    //첫번째 행
                    dp[i][j] = dp[i][j-1] + matrix[i][j];
                } else if (i>0 && j==0){    //첫번째 열
                    dp[i][j] = dp[i-1][j] + matrix[i][j];
                } else if (i>0 && j>0){
                    int min = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
                    dp[i][j] = min + matrix[i][j];
                }

            }

        }
        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));

        return dp[matrix.length-1][matrix[0].length-1];
    }


    public static void main(String[] args) {
        int[][] matrix = {
                { 1,3,2 },
                { 4,6,2 },
                { 1,2,4 }
        };
        MinCostPath minCostPath = new MinCostPath();
        System.out.println(minCostPath.getMinCost(matrix));
    }
}
