package dynamic;

public class Fibonacci {
    public static int fiboDP(int n){
        int[] memo = new int[n+1];

        memo[0] = 1;
        memo[1] = 1;
        if (n>=2){
            for (int i = 2; i < n+1; i++) {
                memo[i] = memo[i-1]+memo[i-2];
            }
        }

        return memo[n];
    }

    public static long fiboDP2(int n, long[] memo){

        if(n<=1)    return 1;
        if (memo[n] == 0){
            memo[n] = fiboDP2(n-1, memo) + fiboDP2(n-2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        //System.out.println(fiboDP(7));

        int n = 7;
        long r = fiboDP2(n, new long[n+1]);
        System.out.println(r);
    }
}
