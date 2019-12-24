import java.util.Scanner;
public class StudentRecordTestHarness {
	public static void main(String [] args) {
		// create Scanner to obtain input from cmd
		Scanner in = new Scanner(System.in);

		
		StudentRecord s1 = new StudentRecord("Jane", "Doe", 1234, 87);
		// call the empty constructor
		StudentRecord s2 = new StudentRecord();


		// print the default value of first name, last name, student id, and grade.
		System.out.println("FirstName : " + s1.getFirstName());
		System.out.println("LastName : " + s1.getLastName());
		System.out.println("studentID : " + s1.getStudentID());
		System.out.println("Grade Letter : " + s1.getGradeLetter());
		
		
		
		System.out.println("Enter your first name: ");
		// grab first name from user
		String firstName = in.nextLine();
		// set first name to method setFirstName
		s2.setFirstName(firstName);
		
		
		System.out.println("Enter your last name: ");
		// grab last name from user
		String lastName = in.nextLine();
		// set last name to method setLastName
		s2.setLastName(lastName);
		
		
		System.out.println("Enter your studentID : ");
		// grab student id from user
		int studentID = in.nextInt();
		// set student id to method setStudentID
		s2.setStudentID(studentID);
		
		
		
		System.out.println("Enter your grade: ");
		// grab student id from user
		int grade = in.nextInt();
		// set grade to method setGradeCourseOne and determine the grade letter of this grade
		s2.setGradeCourseOne(grade);
		
		
		// print out the first name, last name, studentID, and grade letter
		System.out.println("FirstName : " + s2.getFirstName());
		System.out.println("lastName : " + s2.getLastName());
		System.out.println("studentID : " + s2.getStudentID());
		System.out.println("grade : " + s2.getGradeLetter());
	
		
	}

}