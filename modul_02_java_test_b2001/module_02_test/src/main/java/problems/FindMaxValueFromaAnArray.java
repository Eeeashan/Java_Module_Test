package problems;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int largArrey[] = {2,11,25,33,25,11,25,88,65,32,12,20,99,35,02};

        int min = largArrey[0];
        int max = largArrey[0];

        for (int i =0; i<= 14;i++){
            if(largArrey[i]< min) min = largArrey[i];
            if(largArrey[i] >max) max = largArrey[i];

        }
        System.out.println("The largest value in the array is " + max);

    }

}
