package dp;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";    //열
        String str2 = "DCABDC";     //행

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        //str2인 DCABDC를 i로 놓고 바깥쪽에서 반복할 예정
        //str1인 ABCDCBA를 j로 놓고 안쪽에서 반복할 예정
        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
//                System.out.printf("i:%s j:%s\n",str2.charAt(i), str1.charAt(j));

                //두 개가 같으면 대각선에서 가지고 온다.
                //대각선 dp[i-1][j-1] + 1
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else if (str2.charAt(i-1) == str1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    //두 개가 다르면 max(위, 왼쪽)을 기록
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }

            System.out.println(Arrays.toString(dp[i]));

        }
        int answer = dp[str2.length()][str1.length()];
        System.out.println("LCS: "+answer);
    }
}
