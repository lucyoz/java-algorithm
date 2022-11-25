package recursive.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//재귀 사용하여 풀기
public class CodeUp2623_Gcd {
    public static int getGcd(int a, int b){
        if (a == b) return a;
        else {
            int min = a > b ? b : a;
            int max = a < b ? b : a;
            System.out.printf("%d, %d\n",max-min, min);
            return getGcd(max-min, min);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        int result = getGcd(a, b);
        System.out.println("최대공약수: "+result);

    }
}
