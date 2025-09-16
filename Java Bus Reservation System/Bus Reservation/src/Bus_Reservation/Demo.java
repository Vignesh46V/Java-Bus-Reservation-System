package Bus_Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        int userOption = 1;
        Scanner input = new Scanner(System.in);

        while (userOption != 2) {
            System.out.println("Enter 1 for Booking and 2 for Exit.");
            userOption = input.nextInt();

            if (userOption == 1) {
                System.out.println("Booking Starts");
            } else if (userOption == 2) {
                System.out.println("Thank You, Come Again");
            } else {
                System.out.println("Invalid Option. Please enter 1 or 2.");
            }
        }

        input.close();
    }
}
