package homework;

public class Instructor extends User {
    private int instructorId;
    private String courseName;
    private String courseDetail;
    private double courseRate;

    public Instructor() {

    }

    public Instructor(int instructorId, String courseName, String courseDetail, double courseRate) {
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.courseRate = courseRate;
    }

    public Instructor(int id, String firstName, String lastName, String email, String password, int instructorId, String courseName, String courseDetail, double courseRate) {
        super(id, firstName, lastName, email, password);
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.courseRate = courseRate;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public double getCourseRate() {
        return courseRate;
    }

    public void setCourseRate(double courseRate) {
        this.courseRate = courseRate;
    }
}
