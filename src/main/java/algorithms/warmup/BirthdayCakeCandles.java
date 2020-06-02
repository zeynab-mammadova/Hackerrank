package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    static void birthdayCakeCandles(int[] arr) {
        int counter=0;
        for (int value : arr) {
            if (value == arr[arr.length - 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] array = new int[l];
        for(int i=0;i<l;i++)
        {
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        birthdayCakeCandles(array);
    }
}
