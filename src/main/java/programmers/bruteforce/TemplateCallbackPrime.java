package programmers.bruteforce;

public class TemplateCallbackPrime {

    interface Ff {
        boolean eee(int a, int b);
    }

    boolean someOperation(int a, int b) {
        return a < b;
    }

    // i < num
    // i < num / 2
    // i * i < num
    // sqrt

    boolean isPrime(int num){

        for (int i=2; someOperation(i, num); i++){
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(13);
        System.out.println(r);
    }
}
