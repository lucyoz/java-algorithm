package recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1854 {
    public static long sum(long n){
        if(n/10==0) return n;
        return n%10+sum(n/10);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long result = sum(n);
        System.out.println(result);
    }

}
