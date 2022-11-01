package programmers.bruteforce;

interface StatementStrategy {
    boolean compare(int a, int b);

}

public class TemplateCallbackPrime {


    // i < num
    // i < num / 2
    // i * i < num
    // sqrt

    boolean isPrime(int num, StatementStrategy stmt){

        for (int i=2; stmt.compare(i, num); i++){
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r1 = tcp.isPrime(17, (a,b) -> a<b);
        boolean r2 = tcp.isPrime(17, (a,b) -> a<b/2);
        boolean r3 = tcp.isPrime(17, (a,b) -> a*a<b);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}