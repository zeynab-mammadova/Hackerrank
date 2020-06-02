package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.print(sum-arr[arr.length-1]+" ");
        System.out.println(sum-arr[0]);
    }

    public static void main(String[] args) {
        int []array=new int[5];
        miniMaxSum(array);
    }
}

