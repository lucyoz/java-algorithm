package programmers;

public class HarshadNum {
    public int sumNum(int num){
        int sum = 0;
        int i = 1;
        while(num>0){
            sum += num % (int)Math.pow(10,i);
            num /= Math.pow(10,i);
            i++;
        }
        System.out.println(sum);
        return sum;
    }
    public boolean solution(int x){
        if (x%sumNum(x)==0){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        HarshadNum harshadNum = new HarshadNum();

        boolean answer = harshadNum.solution(81);
        System.out.println(answer);
    }
}
