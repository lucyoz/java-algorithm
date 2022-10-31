package programmers.bruteforce;

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
        return new int[0];
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
        pt.solution(answer);
    }
}
