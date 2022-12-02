package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp4037 {
    public static void primeFactor(int n){
        for (int i = 2; i <= n; i++) {
            if (n%i==0){
                System.out.print(i+" ");
                primeFactor(n/i);
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        primeFactor(n);
    }
}
