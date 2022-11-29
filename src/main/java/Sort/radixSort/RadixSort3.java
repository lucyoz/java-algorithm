package Sort.radixSort;

import java.util.*;

public class RadixSort3 {
    public static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복제거 하여 자릿수 구하기
            if (arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i])+1));
        }

        // 중복 제거된 자릿수를 arr에 담기
        int[] answer = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer); //정렬
        return answer;
    }


    public static int[] sort(int[] arr, int digit){
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int divisor = (int)Math.pow(10,digit-1);
            queueArr[Math.floorDiv(arr[i],divisor)%10].add(arr[i]);

        }

        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll();
            }

        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,7,7,8,13,14,16,18,203};
        int[] digits = getDigits(arr);

        for(int digit:digits){
            arr = sort(arr, digit);
            System.out.println(Arrays.toString(arr));
        }
    }
}
