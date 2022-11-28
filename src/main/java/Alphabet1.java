public class Alphabet1 {
    public void printAlphabet(){
        for (int i = 0;  i< 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.printf("%c%c\n",i+65,j+65);

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("실습1");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }

        System.out.println("\n실습2");
        Alphabet1 alphabet1 = new Alphabet1();
        alphabet1.printAlphabet();
    }

}
