package algorithms.warmup;



import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        int sum =0;
        for(int i=0;i<l;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<l;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
