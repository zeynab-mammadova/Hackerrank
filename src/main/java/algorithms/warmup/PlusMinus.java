package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            if (arr[i] > 0){
                pos++;
            }
            else if (arr[i]<0){
                neg++;
            }
            else
                zero++;
        }

        System.out.println(String.format("%.6f",(pos/l)));
        System.out.println(String.format("%.6f",(neg/l)));
        System.out.println(String.format("%.56f",(zero/l)));
    }
}
