package sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

interface SortStrategy{
    boolean apply(int a, int b);
}

public class SelectionSort {
    public int[] selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> stmt){
        for (int i = 0; i < arr.length-1; i++) {
            int swapIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[swapIdx],arr[j])){
                    swapIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = tmp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSort ss = new SelectionSort();
        System.out.println(Arrays.toString(ss.selectionSort(arr, (a, b)-> a>b)));


        //Function<T,R> 인터페이스 쓰는 법
        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10,20}));

        //BiFunction<T,U,R>
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
    }
}
