public class CollegeCourse {
    private int courseReferenceNumber;
    private int courseNumber;

    public CollegeCourse(){

    }

    public CollegeCourse(int courseReferenceNumber, int courseNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
        this.courseNumber = courseNumber;
    }

    public int getCourseReferenceNumber() {
        return courseReferenceNumber;
    }

    public void setCourseReferenceNumber(int courseReferenceNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

}
