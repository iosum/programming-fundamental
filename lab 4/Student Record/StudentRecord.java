public class StudentRecord {
	// initialize four private variables
	private String firstName;
	private String lastName;
	private int studentID;
	private int gradeCourseOne;
	
	// constructor initializes instance variables
	public StudentRecord(String firstName, String lastName, int studentID, int gradeCourseOne){
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.gradeCourseOne = gradeCourseOne;
	}
	
	// set an empty constructor
	public StudentRecord(){
		
	}
	
	// set student's first name
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	// get student's first name
	public String getFirstName(){
		return firstName;
	}
	
	// set student's last name
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	// get student's last name
	public String getLastName(){
		return lastName;
	}
	
	// set student's student ID
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}
	
	// get student's student ID
	public int getStudentID(){
		return studentID;
	}
	
	// set student's grade
	public void setGradeCourseOne(int gradeCourseOne){
		this.gradeCourseOne = gradeCourseOne;
	}
	
	// get student's grade
	public int getGradeCourseOne(){
		return gradeCourseOne;
	}
	
	// set a method getGradeLetter to determine student's lettergrade
	public String getGradeLetter() {
		String lettergrade = "";
		
		// if 90<= student's grade <=100, lettergrade = A 
		if(gradeCourseOne >= 90 && gradeCourseOne <= 100) {
			lettergrade = "A";
		}
		
		// if 80<= student's grade <=89, lettergrade = B
		else if (gradeCourseOne >= 80 && gradeCourseOne <= 89){
			lettergrade = "B";
		}
		
		// if 70<= student's grade <=79, lettergrade = C
		else if(gradeCourseOne >= 70 && gradeCourseOne <= 79) {
			lettergrade = "C";
		}
		
		// if 60<= student's grade <=69, lettergrade = D
		else if(gradeCourseOne >= 60 && gradeCourseOne <= 69) {
			lettergrade = "D";
		}
		
		// if 50<= student's grade <=59, lettergrade = E
		else if(gradeCourseOne >= 50 && gradeCourseOne <= 59) {
			lettergrade = "E";
		}
		
		// else lettergrade = F
		else lettergrade = "F";
		
		// return lettergrade
		return lettergrade;
	}
}