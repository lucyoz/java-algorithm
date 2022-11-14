package programmers.bruteforce;

public class SieveOfEratosthenes {

    public int[] solution(int n){
        int[] arr = new int[n-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }

        int Nsqrt = (int)Math.sqrt(n);

        int count = n-1;
        for (int j = 0; j*j<=n; j++) {

            if(arr[j]!=0){
                int multipleOf = arr[j];
                for (int k = j*2+2; k < arr.length; k+=multipleOf) {
                    if(arr[k]!=0){
                        arr[k] = 0;
                    }

                }
            }



        }
        return arr;

    }

    public static void main(String[] args) {

        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        int cnt = 0;

        int[] answer = sieveOfEratosthenes.solution(10);
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
