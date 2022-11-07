package programmers;

public class HarshadNum {
    public int sum(int num){
        int sumOfDigit = 0;
        while(num>0){
            sumOfDigit += num % 10;
            num /= 10;
        }
        System.out.println(sumOfDigit);
        return sumOfDigit;
    }
    public boolean solution(int x){
        if (x%sum(x)==0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        HarshadNum harshadNum = new HarshadNum();

        boolean answer = harshadNum.solution(687);
        System.out.println(answer);
    }
}
