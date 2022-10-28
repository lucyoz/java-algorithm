package programmers;

import java.util.HashSet;
import java.util.Set;

public class PhonekemonUsingHashSet {
    public int solution(int[] nums){
        Set<Integer> set = new HashSet<>();

        //set을 통해 nums의 중복을 제거한다.
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        //최대 result는 nums개수/2
        int N = nums.length/2;

        //종류Set이 nums개수/2보다 크다면 result는 nums개수/2
        //작다면 종류의 갯수
        if (set.size() < N){
            return set.size();
        } else{
            return N;
        }
    }

}
