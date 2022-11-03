package programmers.bruteforce;

import java.util.Arrays;

public class LoopCheckIdx {

    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1];                      //N-1 크기 (2부터 50까지 총 49개)
        boolean[] checks  = new boolean[nums.length];   //nums만큼 checks
        Arrays.fill(checks, true);                  //checks를 true로 초기화

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+2;
        }


    }
}
