package programmers.bruteforce;

public class PrepareTest {
    public int[] solution(int[] answer){
        /*
        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
       */

        int firstStudentAnswerCnt = 0;

        int[] firstStudent = {1, 2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for(int i=0;i<answer.length;i++){
            if (i>firstStudent.length){
                firstStudent[i] = firstStudent[i%5];
            }
            if(answer[i] == firstStudent[i]){
                firstStudentAnswerCnt++;
            }
        }

        System.out.println(firstStudentAnswerCnt);
        return new int[0];
    }

    public static void main(String[] args) {
        PrepareTest pt = new PrepareTest();
        int[] answer = {1, 3, 2, 4, 2};
        pt.solution(answer);
    }
}
