package algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int bob=0;
        int alice=0;
List<Integer> winner=new ArrayList<Integer>();
        for (int i = 0; i <a.size() ; i++) {
            if (a.get(i)>b.get(i)){
                bob++;
            }
            if (a.get(i)<b.get(i)){
                alice++;
            }
        }
        winner.add(bob);
        winner.add(alice);
        return winner;
    }

    public static void main(String[] args) {
        List<Integer> a= new ArrayList<Integer>(Arrays.asList(1,2,5));
        List<Integer> b= new ArrayList<Integer>(Arrays.asList(4,2,5));
        System.out.println(compareTriplets(a,b));
    }
}
