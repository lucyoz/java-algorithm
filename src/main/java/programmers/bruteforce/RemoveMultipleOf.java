package programmers.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {

    //프로그래머스 [시간초과]
    public static void main(String[] args) {
        int N = 50;   //50미만의 모든 소수를 구하기

        // 2부터 N까지 숫자가 들어있는 List만들기
        List<Integer> NList = new ArrayList<>();
        for(int i=2;i<=N;i++){
            NList.add(i);
        }

        int Nsqrt = (int) Math.sqrt(N);

        for(int i=2;i<=Nsqrt;i++){
            for(int j=0;j<NList.size();j++){
                if (NList.get(j) % i == 0 && NList.get(j) != i){
                    NList.remove(j);
                }
            }
        }

        System.out.println(NList.size());

    }
}
