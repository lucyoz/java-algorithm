package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NoSameNum {
    public List<Integer> solution(int []arr) {


        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int a: arr){
            if ( answer.get(answer.size()-1)!=a){
                answer.add(a);
            }
        }

        return answer;
    }

    public Stack<Integer> solutionUsingStack(int []arr) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()){
                stack.push(arr[i]);
            } else {
                if(stack.peek()!=arr[i]){
                    stack.push(arr[i]);
                }
            }


        }

        return stack;
    }

    public static void main(String[] args) {

        NoSameNum noSameNum = new NoSameNum();
        int[] arr = new int[]{1, 1, 3, 3, 0, 0, 1, 1};

        System.out.println(noSameNum.solution(arr));


    }

}
