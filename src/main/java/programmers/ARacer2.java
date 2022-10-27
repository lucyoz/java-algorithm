package programmers;

import java.util.HashMap;
import java.util.Map;

public class ARacer2 {
    //HashMap을 이용할 수 있다

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            memo.put(participant[i], 1);
        }
        for (int i = 0; i < completion.length; i++) {
            memo.put(completion[i],0);
        }
        for(String key: memo.keySet()){
            if(memo.get(key)==1){
                answer = key;
            }
        }


        return answer;
    }

}
