package problems;

import java.util.Scanner;

public class FindLeapyear {

    /**
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {
        findLeapyear();
    }
    private static void findLeapyear() {
        System.out.println("Enter Year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println( year + " Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println( year+ " Leap Year");
        } else {
            System.out.println( year + " Not a Leap Year");
        }


    }
}
