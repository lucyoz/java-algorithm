package programmers;

import java.util.Stack;

public class NoSameNum {
    public Stack<Integer> solution(int []arr) {

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
