package programmers;

import java.util.Arrays;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1},{2}};
        int[][] arr2 = {{3},{4}};

        System.out.println(arr1[0].length);
        System.out.println(arr1.length);
        MatrixAddition matrixAddition = new MatrixAddition();
        int[][] result = matrixAddition.solution(arr1, arr2);


    }

}
