package programmers;

import java.util.PriorityQueue;

public class IntArray {
    public int[] solution(int[] arr, int divisor){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                priorityQueue.add(arr[i]);
            }
        }

        if(priorityQueue.size()==0){
            priorityQueue.add(-1);
        }

        int[] answer = new int[priorityQueue.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = priorityQueue.poll();
        }
        return answer;
    }
}
