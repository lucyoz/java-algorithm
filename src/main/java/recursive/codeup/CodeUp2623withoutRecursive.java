package recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//재귀를 사용하지 않고
public class CodeUp2623withoutRecursive {
    public static int gcd(int a, int b){
        while( a!= b ){
            if (a > b){
                a = a-b;
            } else if (a < b){
                b = b-a;
            }
            System.out.printf("%d, %d\n",a, b);
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        int result = gcd(a, b);
        System.out.println("최대공약수: "+result);

    }
}
