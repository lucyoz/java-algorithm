package programmers;

import java.util.HashSet;

public class PhoneBookList {
    public boolean solution(String[] phone_book){
        HashSet<String> hs = new HashSet<>();
        for(String num: phone_book){            //Java10 이후에는 타입이 명확한 경우에 var 사용가능
            hs.add(num);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if(hs.contains(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("12".indexOf("123"));        //결과 -1
        System.out.println("123".indexOf("12"));        //결과 0
    }
}
