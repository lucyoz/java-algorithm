package Sort.radixSort;

import java.util.Arrays;

public class RadixSort1 {
    public static int[] sort(int[] arr){
        int[] radixArr = new int[10];
        Arrays.fill(radixArr,-1);
        for (int i = 0; i < radixArr.length; i++) {
            radixArr[arr[i]] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(radixArr));
        return radixArr;
    }


    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 0};

        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1);

        for(int i:arr){
            radixArr[i] = i;
        }

        System.out.println(Arrays.toString(radixArr));

        int cnt = 0;
        for (int i = 0; i < radixArr.length; i++) {
            if(radixArr[i]!=-1){
                arr[cnt++] = radixArr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
