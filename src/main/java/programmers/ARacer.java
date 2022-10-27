package programmers;

import java.util.HashMap;
import java.util.Map;

public class ARacer {
    //HashMap을 이용할 수 있다

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //이름, 완주했는지 여부
        Map<String, Integer> memo = new HashMap<>();

        //1. HashMap memo에 Participant를 모두 넣습니다. (1로 초기화)
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }
        //2. completion에 들어있는 이름을 key를 HashMap에 검색합니다.
        //    있다면 0으로 check
        for (int i = 0; i < completion.length; i++) {
            String key = (completion[i]);
            memo.put(key, 0);
        }

        //3. memo를 한바퀴 돌면서 1인 값을 찾습니다.
        for(String key : memo.keySet()){
            if (memo.get(key) == 1){
                answer = key;
            }
        }
        //Participant에 1명이 남습니다. 그러명 1명을 return


        return answer;
    }

}
