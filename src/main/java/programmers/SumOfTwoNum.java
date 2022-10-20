package programmers;

public class SumOfTwoNum {

    public long solution(int a, int b){
        long answer = 0;
        int big = a;
        int small = b;
        if(a<b){
            big = b;
            small = a;
        }
        for(int i=small;i<=big;i++){
            answer += i;
        }
        return answer;
    }
}
