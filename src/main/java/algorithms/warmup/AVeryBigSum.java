package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        long[] arr = new long[l];
        long sum =0;
        for(int i=0;i<l;i++)
        {
            arr[i]= sc.nextLong();
        }
        for(int i=0;i<l;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
