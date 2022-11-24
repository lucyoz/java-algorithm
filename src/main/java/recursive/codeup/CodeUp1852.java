package recursive.codeup;

import java.util.Scanner;

public class CodeUp1852 {

    public static int printN(int n, int i){
        if (n==i)   return n;
        System.out.print(i+" ");
        i++;
        return printN(n, i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = printN(n, 1);
        System.out.println(result);
    }
}
