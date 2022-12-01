package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score){
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            if (i<k){
                queue.add(score[i]);
            }
            if(queue.size() <= i && queue.peek()<score[i]){
                queue.poll();
                queue.add(score[i]);
            }
            System.out.println(queue.peek());
            answer[i] = queue.peek();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();
        int[] result = hallOfFame.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});

        System.out.println(Arrays.toString(result));

    }
    
    
}
