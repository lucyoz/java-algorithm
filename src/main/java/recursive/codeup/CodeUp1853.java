package recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1853 {

    public static int sum(int n){
        if (n<=1)   return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = sum(n);
        System.out.println(result);
    }


}
