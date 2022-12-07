package programmers.heap;

import java.util.PriorityQueue;

//PriorityQueue 이용
public class Spicier {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue pq = new PriorityQueue();
        for(int sco : scoville){
            pq.add(sco);
        }

        while((int)pq.peek()<K){
            int a = (int) pq.poll();
            int b = (int) pq.poll();
            pq.add(a+2*b);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = new int[] {1, 2, 3, 9, 10, 12};
        Spicier spicier = new Spicier();
        System.out.println(spicier.solution(scoville, 7));

    }
}
