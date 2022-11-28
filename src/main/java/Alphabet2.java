public class Alphabet2 {
//    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void printAtoZ(char c){
        if (c=='Z') return;
        System.out.println(c);
        printAtoZ((char)(c+1));
    }

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet.charAt(i));
        }

        System.out.println();
        */

        printAtoZ('A');

    }
}
