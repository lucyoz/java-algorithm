package codeup;

import java.util.Scanner;

public class Codeup2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int targetNum = s;
        int startIdx = 0, endIdx = nArr.length-1;

        while(true){
            //중간값 찾기
            int midIdx = startIdx + (endIdx-startIdx) / 2;

            //인덱스(시작, 끝점) 옮기기기
            if (targetNum < nArr[midIdx]){
                endIdx = midIdx;
            } else if (targetNum > nArr[midIdx]){
                startIdx = midIdx;
            } else {
                System.out.println(midIdx+1);
                break;
            }

        }
    }
}
