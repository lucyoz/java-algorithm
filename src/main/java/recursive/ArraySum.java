package recursive;

public class ArraySum {
    public static int sumOfArray(int[] array, int i){

        if(array.length==i) return 0;
        int sum = array[i];
        i++;
        return sum + sumOfArray(array, i);

    }

    public static void main(String[] args) {
        int[] array = {7,3,2,9};
        int result = sumOfArray(array,0);
        System.out.println(result);
    }
}
