package David;

import java.util.Arrays;

public class ArrayOfMultiples {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfMultiples(3, 10)));
        System.out.println(Arrays.toString(arrayOfMultiples(5, 5)));
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int sum = 0;
        int [] arr = new int[length];
        gi
        for(int i = 0; i < length; i++){
            sum += num;
            arr[i] = sum;
        }
        return arr;
    }
}
