package recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1860 {
    //숫자 출력
    public static void printNum(int n){
        if(n<=0)    return;
        printNum(n-1);
        System.out.print(n+" ");
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


    }
}
