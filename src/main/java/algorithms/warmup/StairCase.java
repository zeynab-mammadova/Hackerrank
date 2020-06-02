package algorithms.warmup;

public class StairCase {
    static void staircase(int n) {
        String str="#";
        for (int i=0;i<n;i++)
        {
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
        }
    }

    public static void main(String[] args) {
        staircase(4);
    }
}
