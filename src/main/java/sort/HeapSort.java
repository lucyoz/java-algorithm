package sort;

import java.util.Arrays;

public class HeapSort {
    public int[] makeHeap(int[] arr, int parentIdx){
        int leftIdx = 2*parentIdx+1;
        int rightIdx = 2*parentIdx+2;
        int greaterIdx = parentIdx;

        //왼쪽이 parent보다 크면 greaterIdx = leftIdx  6 7 5 --> 7 6 5
        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]){
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greaterIdx 보다 크면
        if(rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        //swap
        int temp = arr[parentIdx];
        arr[parentIdx] = arr[greaterIdx];
        arr[greaterIdx] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr= new int[] {6, 5, 7, 8};
        int[] arr2 = new int[] {4, 8, 5, 7, 3, 2, 9, 6, 7};

        HeapSort heapSort = new HeapSort();
        System.out.println(Arrays.toString(heapSort.makeHeap(arr2, 3)));
        System.out.println(Arrays.toString(heapSort.makeHeap(arr2, 2)));

        System.out.println(Arrays.toString(heapSort.makeHeap(arr2, 1)));
        System.out.println(Arrays.toString(heapSort.makeHeap(arr2, 0)));
        System.out.println(Arrays.toString(heapSort.makeHeap(arr2, 2)));

    }
}
