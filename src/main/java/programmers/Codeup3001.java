package programmers;

import java.util.Scanner;

public class Codeup3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int i = 0;
        while(i<nArr.length){
            if (nArr[i] == k){
                System.out.println(i+1);
                break;
            }
            i++;
        }
        if (i==nArr.length){
            System.out.println("-1");
        }


    }
}
