package programmers.heap;

import java.util.PriorityQueue;

//PriorityQueue 이용
public class Spicier {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int sco : scoville){
            pq.add(sco);
        }

        while(pq.size()>1 && pq.peek()<K){
            int a =  pq.poll();
            int b =  pq.poll();
            pq.add(a+2*b);
            answer++;
        }

        if (pq.size()<=1 && pq.peek()<K){
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = new int[] {1, 2, 3, 9, 10, 12};
        Spicier spicier = new Spicier();
        System.out.println(spicier.solution(scoville, 7));

    }
}
