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

        // 2의 배수 지우기
        int multipleOf = 2;//(2의 배수)
        for(int i=2;i<nums.length;i+=2){
            checks[i] = false;
        }

        //checks를 참고해서 true인 nums[i]만 출력
        for(int i=0;i<checks.length;i++){
            if (checks[i] == true){
                System.out.println(nums[i]);
            }
        }


    }
}
