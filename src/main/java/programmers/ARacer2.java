package programmers;

import java.util.HashMap;
import java.util.Map;

public class ARacer2 {
    //HashMap을 이용할 수 있다

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            //바로 put을 할 수 없고 숫자 올려야한다.
            String key = participant[i];
            if(!memo.containsKey(key)){
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key)+1);

        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, memo.get(key)-1);
        }
        for(String key: memo.keySet()){
            if(memo.get(key)==1){
                answer = key;
            }
        }


        return answer;
    }

}
