package recursive;

public class Print1To100 {
    public static void print1To100(int n){
        if(n>100) return;           // 여기에 도달 할 수 있게 n을 증가시켜야
        System.out.println(n);
        print1To100(n+1);
    }

    public static void main(String[] args) {
        print1To100(1);         //출발을 1에서 함.
    }
}
