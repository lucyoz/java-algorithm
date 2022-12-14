package programmers;

import java.util.Arrays;

public class SecretMap {
    //각 array의 요소 값들을 2진수로 바꾸기 -> 바꾸지 않아도 됨!?
    // arr1과 arr2 같은 idx끼리 OR 연산
    // 1을 #로, 0을 " "으로

    //10진수를 2진수로 만드는 함수
    String getBinaryString(int decNum){
        String answer = "";
        while(decNum > 0){
            answer += decNum % 2;
            decNum /= 2;
        }
        return answer;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];


        for (int i = 0; i < n; i++) {
            String bin = Integer.toBinaryString(arr1[i] | arr2[i]);
            //bin = "0".repeat(n-bin.length())+bin;
            bin = bin.replace("1","#");
            bin = bin.replace("0"," ");
            answer[i] = bin;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap secretMap = new SecretMap();
        String[] answer = secretMap.solution(5,arr1,arr2);
        System.out.println(Arrays.toString(answer));
    }
}
