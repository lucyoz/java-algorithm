package programmers;

import java.util.HashSet;
import java.util.Set;

public class Phonekemon {
    //최대 result는 N/2
    //종류가 N/2보다 크다면 result는 N/2
    //작다면 종류의 갯수

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //중복을 없애기 위해 set을 이용[3, 2, 1, 2] -> [3, 2, 1]
        int N = nums.length / 2;

        // set의 갯수와 N 중에서 더 큰 하나를 return합니다.
        // length 6개, N = 3, [333222]
        if (set.size() < N){
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {

    }
}
