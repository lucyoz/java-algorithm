package programmers.bruteforce;

public class SieveOfEratosthenes {

    public int solution(int n){
        int[] arr = new int[n-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+2;
        }

        int Nsqrt = (int)Math.sqrt(n);

        int count = arr.length;
        for (int i = 2; i<= Nsqrt; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%i==0 && arr[j]!=i && arr[j]!=0){
                    arr[j] = 0;
                    count--;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {

        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        int answer = sieveOfEratosthenes.solution(10);
        System.out.println(answer);
    }
}
