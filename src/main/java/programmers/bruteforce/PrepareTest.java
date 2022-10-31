package programmers.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepareTest {
    public int[] solution(int[] answer){
        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
       */


        int[] firstStudent = {1, 2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstStudentAnswerCnt =StudentAnswerCnt(firstStudent, answer);
        int secondStudentAnswerCnt =StudentAnswerCnt(secondStudent, answer);
        int thirdStudentAnswerCnt =StudentAnswerCnt(thirdStudent, answer);

        System.out.println(firstStudentAnswerCnt);
        System.out.println(secondStudentAnswerCnt);
        System.out.println(thirdStudentAnswerCnt);

        int[] score = {firstStudentAnswerCnt, secondStudentAnswerCnt, thirdStudentAnswerCnt};

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        //max 구하기
        //max와 같으면 append한다.
//        int[] result = new int[3];
        List<Integer> studentWithTheMaxScore = new ArrayList<>();

        for(int i=0;i<score.length;i++){
            if(maxScore == score[i]){
                studentWithTheMaxScore.add(i+1);
            }
        }

        //List -> Array로
        int[] result = new int[studentWithTheMaxScore.size()];
        for(int i=0;i<studentWithTheMaxScore.size();i++){
            result[i] = studentWithTheMaxScore.get(0);
        }
        return result;
    }

    public int StudentAnswerCnt(int[] student, int[] answer){
        int StudentAnswerCnt = 0;
        for(int i=0;i<answer.length;i++){
            if (i>student.length){
                student[i] = student[i%student.length];
            }
            if(answer[i] == student[i]){
                StudentAnswerCnt++;
            }
        }
        return StudentAnswerCnt;
    }

    public static void main(String[] args) {
        PrepareTest pt = new PrepareTest();
        int[] answer = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(pt.solution(answer)));
    }
}
