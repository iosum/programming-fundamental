import java.util.Scanner;
public class AirlilneReservationTestHarness {
    public static void main(String [] args) {
        
        // instantiate an object a1 and have a default first name, last name, flight number and seat number
        AirlineReservation a1 = new AirlineReservation("Jane", "Doe", 123, 1);
        
        // get all the information and print them out
        System.out.println(a1.getFirstName());
        System.out.println(a1.getLastName());
        System.out.println(a1.getFlightNumber());
        System.out.println(a1.getSeatNumber());
        System.out.println(a1.getSeatingClass());
        
        // call the void method
        a1.getCapitalLetter();
        
        // create Scanner to obtain input from cmd
        Scanner in = new Scanner(System.in);
        
        // call the empty constructor
        AirlineReservation a2 = new AirlineReservation();
        
        System.out.println("Enter your first name: ");
        // grab first name from user
        String firstName = in.nextLine();
        // set first name to method setFirstName
        a2.setFirstName(firstName);
        
        System.out.println("Enter your last name: ");
        // grab last name from user
        String lastName = in.nextLine();
        // set last name to method setLastName
        a2.setLastName(lastName);
        
        
        System.out.println("Enter your flight number: ");
        // grab flight number from user
        int flightNumber = in.nextInt();
        // set the flight number to method setFlightNumber
        a2.setFlightNumber(flightNumber);
        
        System.out.println("Enter your seat number: ");
        // grab seat number from user
        int seatNumber = in.nextInt();
        // set the seat number to method setSeatNumber
        a2.setSeatNumber(seatNumber);
        
        
        // print out all the information of a2
        System.out.println("Your first name : " + a2.getFirstName());
        System.out.println("Your last name : " + a2.getLastName());
        System.out.println("Your flight number : " + a2.getFlightNumber());
        System.out.println("Your seat number : " + a2.getSeatNumber());
        System.out.println("Your seating class is : " + a2.getSeatingClass());
        a2.getCapitalLetter();
    }
}