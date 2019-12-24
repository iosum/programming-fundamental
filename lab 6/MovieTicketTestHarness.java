import java.util.Scanner;

public class MovieTicketTestHarness {
    public static void main(String [] args) {

        // create Scanner to obtain inputs from cmd
        Scanner in = new Scanner(System.in);
        MovieTicket m1 = new MovieTicket();

        System.out.println("movie name: ");
        // grab the movie name from the user
        String movieName = in.nextLine();
        // set the movie name to the variable movieName
        m1.setMovieName(movieName);

        System.out.println("ticket number: ");
        // grab the ticket number from the user
        int ticketNumber = in.nextInt();
        // set the ticket number to the variable ticketNumber
        m1.setTicketNumber(ticketNumber);


        System.out.println("theater number: ");
        // grab the theater number from the user
        int theaterNumber = in.nextInt();
        // set the ticket number to the variable ticketNumber
        m1.setTheaterNumber(theaterNumber);


        // get the movie name
        System.out.println("movie Name : " + m1.getMovieName());
        // get the ticket number
        System.out.println("ticket number : " + m1.getTicketNumber());
        // get the theater number
        System.out.println("theater number : " + m1.getTheaterNumber());
        // get the ticket price
        System.out.println("ticket price: " + MovieTicket.calculateTax());
        // get the date from movie
        System.out.println("movie date: " + m1.movieRunDates(m1.getMovieName()));
        System.out.println("movie date: " + m1.movieRunDates(m1.getTicketNumber()));

    }
}

