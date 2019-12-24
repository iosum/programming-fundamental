public class TestChequingAccount{
	
	 public static void main(String[] args) {
		
		// create a new object called c1 and assign the first name to jane, last name to doe and the default
		// balance is 320.50
		ChequingAccount c1 = new ChequingAccount("Jane","Doe", 320.50);
		
		//using getter to get the first name, last name and balance
		String c1FirstName = c1.getFirstName();
		String c1LastName = c1.getLastName();
        double c1Balance = c1.getBalance();
		
		// print out the first name and the last name
        System.out.println("Your first name: " + c1FirstName);
        System.out.println("Your last name: " + c1LastName);
        
		// call the deposit method and deposit 39.2 dollars to the balance
		c1.deposit(39.2);
		
		// print out the final balance
		System.out.println("your balance is : " + c1.getBalance());
   }
}