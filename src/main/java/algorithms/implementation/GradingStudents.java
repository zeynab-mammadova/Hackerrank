package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {

       return grades.stream().map(x->{
           int remainder=x%5;
           if(remainder>2 && x>37){
               x=x+(5-remainder);
           }
           return x;
       }).collect(Collectors.toList());
    }


}
