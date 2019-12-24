public class ChequingAccount {
	private String firstName;
	private String lastName;
	private double balance;

	// set a constructor takes three arguments firstname, last name and opening balance
	public ChequingAccount(String firstName, String lastName, double openingBalance){
		this.firstName = firstName;
		this.lastName = lastName;
		balance = openingBalance;
	}
	
	// set a getter for getting first name
	public String getFirstName(){
		return firstName;
	}
	
	// set a setter for setting first name
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	// set a getter for getting last name
	public String getLastName(){
		return lastName;
	}
	// set a setter for setting last name
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	// set a getter for getting balance
	public double getBalance(){
		return balance;
	}
	// set a setter for setting balance
	public void setBalance(double balance){
		this.balance = balance;
	}
	// create a method called deposit and can be assigned to this.balance
	public void deposit(double amount){
		this.balance += amount;
	}
	
	
}