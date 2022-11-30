package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1936 {
    public static int goUp(int a, int b){
        if (a > b){
            return goUp(a/2, b) + 1;    //a를 부모쪽으로
        } else if (a < b){
            return goUp(a, b/2) + 1;    //b를 부모쪽으로
        }else {     //a==b
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        System.out.println(goUp(a, b));
    }
}
