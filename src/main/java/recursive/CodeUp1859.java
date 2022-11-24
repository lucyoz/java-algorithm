package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1859 {
    //별을 찍는 메소드
    public static void printStar(int n){
        if (n<=0) return;
        printStar(n-1);
        System.out.print("*");
    }

    //공백을 찍는 메소드
    public static void print(int n){
        if(n<=0)    return;
        print(n-1);
        printStar(n);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        print(n);
    }
}
