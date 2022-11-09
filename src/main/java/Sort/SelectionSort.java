package Sort;

import java.util.Arrays;

interface StatemetnStrategy{
    boolean apply(int a, int b);
}

public class SelectionSort {
    public int[] selectionSort(int[] arr, StatemetnStrategy stmt){
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx],arr[j])){
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort ss = new SelectionSort();
        System.out.println(Arrays.toString(ss.selectionSort(arr, (a, b)-> a>b)));
    }
}
