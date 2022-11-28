package recursive.alphabet;

public class Alphabet2 {
//    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void printAtoZ(char c, String prefix){
        if (c>'Z') return;
        System.out.println(prefix+c);
        printAtoZ((char)(c+1), prefix);
    }
    public static void printAlphabet(String prefix, int depth){
        if(prefix.length()>=depth){
            System.out.println(prefix);
            return;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            printAlphabet(prefix+c, depth);
        }
    }

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet.charAt(i));
        }

        System.out.println();
        */

//        printAtoZ('A',"AA");
        printAlphabet("",1);
    }
}
