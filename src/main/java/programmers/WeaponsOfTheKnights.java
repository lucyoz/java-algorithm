package programmers;

public class WeaponsOfTheKnights {

    public int getNumberOfDivisors(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                count++;
            }
        }
        return count++;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int weapon = 0;

        for (int i = 0; i < number; i++) {
            weapon = getNumberOfDivisors(i+1);
            if (weapon<=limit){
                answer += weapon;
            } else {
                answer += power;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WeaponsOfTheKnights weapons = new WeaponsOfTheKnights();
        int result = weapons.solution(10, 3, 2);
        System.out.println(result);
    }
}
