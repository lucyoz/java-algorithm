package dp;

import java.util.Scanner;

//LCS
public class CodeUp2699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //str2가 행, str1이 열
        int[][] dp = new int[str2.length()+1][str1.length()+1];
        for (int i = 1; i <= str2.length() ; i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if(i==0 || j==0){
                    dp[i][j] = 0;
                } else if (str2.charAt(i-1)==str1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        int answer = dp[str2.length()][str1.length()];
        System.out.println(answer);

    }
}
