package programmers.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    public int solution(int n) {
        int answer = 0;

        int k = 2;
        List<Integer> answerList = new ArrayList<>();

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                answerList.add(i);
            }
        }

        System.out.println(answerList);
        answer = answerList.size();
        return answer;
    }

    public boolean isPrime(int n){

        if(n>1){
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.solution(10));
    }
}
