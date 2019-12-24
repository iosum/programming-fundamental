import java.util.Scanner;
public class AirlineReservation {
    
    // create four variables
    private String firstName;
    private String lastName;
    private int flightNumber;
    private int seatNumber;
    
    // set up a constructor to allow the default first name, last name, flight number, seat number
    public AirlineReservation(String firstName, String lastName, int flightNumber, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }
    
    
    // set a default constructor
    public AirlineReservation() {
    
    }
    
    
    // set a setter for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // set a getter for getting first name
    public String getFirstName() {
        return firstName;
    }
    
    // set a setter for setting last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // set a getter for getting last name
    public String getLastName(){
        return lastName;
    }
    
    // set a setter for setting a flight number
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    // set a getter for getting a flight number
    public int getFlightNumber(){
        return flightNumber;
    }
    
    // set a setter for setting a seat number
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    // set a getter for getting a seat number
    public int getSeatNumber(){
        return seatNumber;
    }
    
    // set a method getSeatingClass to have a seating class
    public String getSeatingClass(){
        String seatingClass = "";
        
        switch(this.seatNumber){
            // if the seat number is equals to 1,2, and 3, seating class is assigned to first class and break the statement.
            case 1:
            case 2:
            case 3:
                seatingClass = "First Class";
                break;
            // if the seat number is equals to 4,5, and 6, seating class is assigned to first class and break the statement.
            case 4:
            case 5:
            case 6:
                seatingClass = "Second Class";
                break;
            // if the seat number is equals to 7,8, and 9, seating class is assigned to first class and break the statement.
            case 7:
            case 8:
            case 9:
                seatingClass = "Third Class";
                break;
            // if the seat number is equals to 10,11, and 12, seating class is assigned to first class and break the statement.
            case 10:
            case 11:
            case 12:
                seatingClass = "Fourth Class";
                break;
        }
        return seatingClass;
    }
    
    // convert lowercase to uppercase
    public void getCapitalLetter(){
        // create a character letter
        char letter = ' ';
        
        // use method toUpperCase() to convert character to uppercase
        firstName = firstName.toUpperCase();
        
        // loop through every character and print them
        for(int i = 0; i < firstName.length(); i++){
            letter = firstName.charAt(i);
            System.out.println(letter);
        }
        
    }
    
}
