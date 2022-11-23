package recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int fibo(int n){
        if(n<=2) return 1;
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        for (int i = 2; i < 7; i++) {
            nums.add(nums.get(i-1)+nums.get(i-2));
        }
        return nums.get(n-1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibo(7);
        System.out.println(result);
    }
}
