package Bus_Reservation;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) throws ParseException {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking>bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,false,2));
        buses.add(new Bus(2,true,40));
        buses.add(new Bus(3,true,55));


        int userOption = 1;
        Scanner input = new Scanner(System.in);

        for (Bus bus: buses){
            bus.displayInfo();
        }

        while (userOption !=2) {
            System.out.println("Enter 1 for Booking and 2 for Exit.");
            userOption = input.nextInt();
            if(userOption==1){
                Booking booking = new Booking();
                if (booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("your Booking is confirmed.");
                }else {
                    System.out.println("Sorry, Try Another bus or date,");
                }
            }else {
                System.out.println("Thank You, Come Again");
            }

        }
    }
}
