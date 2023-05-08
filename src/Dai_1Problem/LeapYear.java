package Dai_1Problem;
import java.util.Scanner;

public class LeapYear {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();

            if (year >= 1582) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println("Please enter a year that is greater than or equal to 1582.");
            }
        }
    }


