/**Demonstration class
       *Author: Chiaying Ho
       *Date: 09132019
       *Time: 9:00am ET
*/

import java.util.Scanner;
public class GradeCalculator{
	
	//the GradeCalculator class has five fields.
	public int gradeOne;
	public int gradeTwo;
	public int gradeThree;
	public int gradeFour;
	public int average;
	
	//this class has one method called CalculateAverage
	public void calculateAverage(){

		//instantiate Scanner object
		Scanner in = new Scanner(System.in);

		//let the user type their grade
		System.out.println("Please input grade 1: ");
		
		//grab data from the user and assign it to a variable called gradeOne
		gradeOne = in.nextInt();

		//let the user type their grade
		System.out.println("Please input grade 2: ");

		//grab data from the user and assign it to a variable called gradeTwo
		gradeTwo = in.nextInt();

		//let the user type their grade
		System.out.println("Please input grade 3: ");

		//grab data from the user and assign it to a variable called gradeThree
		gradeThree = in.nextInt();
		
		//let the user type their grade
		System.out.println("Please input grade 4: ");
		
		//grab data from the user and assign it to a variable called gradeFour
		gradeFour = in.nextInt();
		
		//calculate average grade
		average = (gradeOne + gradeTwo + gradeThree + gradeFour)/4;
		
		//print the average number
		System.out.println("The average number is: " + average);

		
	}
	
	
	
}
