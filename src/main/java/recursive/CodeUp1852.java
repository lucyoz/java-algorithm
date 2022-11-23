package recursive;

import java.util.Scanner;

public class CodeUp1852 {

    public static int printN(int n){
        if (n==1)   return 1;
        System.out.print(n+" ");
        return printN(n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = printN(n);
        System.out.println(result);
    }
}
