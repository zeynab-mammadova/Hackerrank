package algorithms.implementation;

public class CountingValley {

    static int countingValleys(int n, String s) {


        int valleyNum = 0;
        int level = 0;
        for(char c : s.toCharArray()) {

            if(level ==0 && c=='D') {
                valleyNum++;
            }

            if(c == 'D') {
                level--;
            }
            else {
                level++;
            }
        }

        return valleyNum;
    }
}
