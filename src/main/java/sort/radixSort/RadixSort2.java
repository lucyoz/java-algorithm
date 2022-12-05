package sort.radixSort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort2 {
    public int[] maxDigits(int[] arr){
        Set<Integer> digits = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                digits.add(1);
            } else {
                int digit = (int)(Math.log10(arr[i])+1);
                digits.add(digit);
            }

        }

        int[] answer = new int[digits.size()];
        int idx = 0;
        for(Integer digit:digits){
            answer[idx++] = digit;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,7,7,8,13,14,16,18,203};
        RadixSort2 radixSort2 = new RadixSort2();
        int[] result = radixSort2.maxDigits(arr);
        System.out.println(Arrays.toString(result));
    }
}
