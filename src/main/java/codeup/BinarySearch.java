package codeup;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNum = 7;
        int startIdx = 0, endIdx = nums.length;

        while(true){
            //중간값 찾기
            int midIdx = startIdx + (endIdx-startIdx) / 2;

            //인덱스(시작, 끝점) 옮기기기
            if (targetNum < nums[midIdx]){
                endIdx = midIdx;
            } else if (targetNum > nums[midIdx]){
                startIdx = midIdx;
            } else {
                System.out.println(midIdx+1);
                break;
            }

        }

    }
}
