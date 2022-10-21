package programmers;

import java.util.Arrays;
import java.util.Stack;

public class SolveBracker {
    //replace 이용
    public boolean solution1(String s){
        while(s.indexOf("()")>=0){
            s = s.replaceAll("\\(\\)","");

        }
        return s.length()==0;
    }

    public boolean solution2(String s){
        while(s.indexOf("()")>=0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);
        }

        return s.length()==0;
    }

    public boolean solution(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if('('== (s.charAt(i))){
                st.push(s.charAt(i));
            } else if(')' == s.charAt(i)){
                if(st.empty())  return false;
                st.pop();
            }
        }

        return st.empty();
    }
}
