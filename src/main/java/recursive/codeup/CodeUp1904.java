package recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1904 {
    public static void printOdd(int a, int b){
        if (a%2 == 0)   a++;
        if (a>b)    return;
        System.out.print(a+" ");
        printOdd(a+2, b);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        printOdd(a, b);
    }
}
