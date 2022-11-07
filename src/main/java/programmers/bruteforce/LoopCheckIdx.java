package programmers.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopCheckIdx {

    public static void printNums(int[] nums, boolean[] checks){
        int cnt = 0;
        for(int i=0;i<checks.length;i++){
            if(checks[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1];                      //N-1 크기 (2부터 50까지 총 49개)
        boolean[] checks  = new boolean[nums.length];   //nums만큼 checks
        Arrays.fill(checks, true);                  //checks를 true로 초기화

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;
        }

        //nums[j] + j 가 왜 2n? ->
        for (int j = 0; j*j <= N; j++) {

            int multipleOf = nums[j]; //j=0 nums[0]=2
            for(int i=nums[j]+j;i<nums.length;i+=multipleOf){
                checks[i] = false;
            }
        }
        printNums(nums,checks);


    }
}
