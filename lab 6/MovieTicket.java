public class MovieTicket {
    // create a private variable called movieName
    private String movieName;
    // create a private variable called ticketNumber
    private int ticketNumber;
    // create a private variable called theaterNumber
    private int theaterNumber;
    // create a public static variable called ticketPrice
    public static double ticketPrice = 10.0;



    // get the movie name
    public String getMovieName() {
        return movieName;
    }
    // get the ticket number
    public int getTicketNumber() {
        return ticketNumber;
    }
    // get the theater number
    public int getTheaterNumber() {
        return theaterNumber;
    }
    // set the movie name
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    // set the ticket number
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    // set the theater number
    public void setTheaterNumber(int theaterNumber) {
        this.theaterNumber = theaterNumber;
    }
    // calculate the ticket price with tax
    public static double calculateTax(){
        return ticketPrice *= 1.13;
    }

    // overloading method movieRunDates
    public String movieRunDates (String movieName){
        String date = "";
        switch (movieName) {
            // if the movie name is HungerGame1
            case "HungerGame1":
                // the date of the movie will be 1/1
                date = "1/1";
                break;
            // if the movie name is HungerGame2
            case "HungerGame2":
                // the date of the movie will be 1/2
                date = "1/2";
                break;
            // if the movie name is HungerGame3
            case "HungerGame3":
                // the date of the movie will be 1/3
                date = "1/3";
                break;
            // if the movie name is HungerGame4
            case "HungerGame4":
                // the date of the movie will be 1/4
                date = "1/4";
                break;
        }
        return date;
    }

    // overloading method movieRunDates
    public String movieRunDates (int ticketNumber){
        String date = "";
        switch (ticketNumber){
            // if the ticket number is 1
            case 1:
                // the date of the movie will be 1/1
                date = "1/1";
                break;
            // if the ticket number is 2
            case 2:
                // the date of the movie will be 1/2
                date = "1/2";
                break;
            // if the ticket number is 3
            case 3:
                // the date of the movie will be 1/3
                date = "1/3";
                break;
            // if the ticket number is 4
            case 4:
                // the date of the movie will be 1/4
                date = "1/4";
                break;
        }
        return date;
    }

}
