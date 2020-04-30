package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "CAT";
        String str2 = "ACT";

        if (findAnagram(str1,str2)==true){
            System.out.println("It is an Anagram");
        }else {
            System.out.println("Not not Anagram");
        }
    }
    public static boolean findAnagram(String str1,String str2){
        // find whether this word is anagram or not
        char[] charArrayFromStr1 = str1.toCharArray();
        char[] charArrayFromStr2 = str2.toCharArray();

        Arrays.sort(charArrayFromStr1);
        Arrays.sort(charArrayFromStr2);


        return Arrays.equals(charArrayFromStr1,charArrayFromStr2);
    }
}
