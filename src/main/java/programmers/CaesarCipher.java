package programmers;


public class CaesarCipher {
    public String solution(String s, int n){
        String answer = "";

        char[] cArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            cArr[i] = s.charAt(i);

            if (cArr[i] == ' '){
                answer += cArr[i];
            } else if (Character.isUpperCase(cArr[i]) ){
                answer += (char)('A'+(cArr[i]+n-'A')%26);
            } else if(Character.isLowerCase(cArr[i])){
                answer += (char)('a'+(cArr[i]+n-'a')%26);
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        String s = "z";
        CaesarCipher caesarCipher = new CaesarCipher();
        String result = caesarCipher.solution(s,4);
        System.out.println(result);
    }
}
