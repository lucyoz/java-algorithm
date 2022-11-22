package recursive;

import java.util.ArrayList;
import java.util.List;

public class ListSum {

    public static int sumOfList(List<Integer> nums){
        if (nums.isEmpty()) return 0;
//        int last = nums.get(nums.size()-1);
        int last = nums.remove(nums.size()-1);  //remove가 반환해줌
        return last+sumOfList(nums);

    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        int result = sumOfList(nums);
        System.out.println(result);

    }
}
