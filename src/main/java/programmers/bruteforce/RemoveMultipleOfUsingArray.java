package programmers.bruteforce;

import java.util.Arrays;

public class RemoveMultipleOfUsingArray {
    public static void main(String[] args) {
        int N = 50;

        int[] nums = new int[N-1];
        for(int i=0;i<nums.length;i++){
            nums[i] = i+2;
        }

        boolean[] checks = new boolean[N-1];
        Arrays.fill(checks, true);

        int Nsqrt = (int) Math.sqrt(N);

        for(int i=2;i<=Nsqrt;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]%i==0 && nums[j]!=i){
                    checks[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(checks[i]==true){
                System.out.print(nums[i]+", ");
                count++;
            }
        }

        System.out.println(count);
    }
}
