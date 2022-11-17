package Sort;

import java.util.Arrays;

public class QuickSort {

    public int[] sort(int[] arr, int startIdx, int endIdx){
        int pivot = arr[arr.length/2];

        System.out.println("pivot: "+pivot);
        int leftIdx = 0, rightIdx = arr.length-1;

        while(leftIdx<=rightIdx){
            while (pivot > arr[leftIdx]){
                leftIdx += 1;
            }
            while (pivot < arr[rightIdx]){
                rightIdx -= 1;
            }
            if (leftIdx<=rightIdx){
                int tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 5, 50, 25};

        QuickSort quickSort = new QuickSort();
        int[] sortedArr = quickSort.sort(arr, 0, arr.length-1);


    }
}
