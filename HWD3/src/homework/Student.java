package homework;

public class Student extends User {
    private int studentId;
    private String toPurchasedCourses;
    private String[] purchasedCourses;

    public Student() {

    }

    public Student(int studentId, String toPurchasedCourses, String[] purchasedCourses) {
        this.studentId = studentId;
        this.toPurchasedCourses = toPurchasedCourses;
        this.purchasedCourses = purchasedCourses;
    }

    public Student(int id, String firstName, String lastName, String email, String password, int studentId, String toPurchasedCourses, String[] purchasedCourses) {
        super(id, firstName, lastName, email, password);
        this.studentId = studentId;
        this.toPurchasedCourses = toPurchasedCourses;
        this.purchasedCourses = purchasedCourses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String[] getPurchasedCourses() {
        return purchasedCourses;
    }

    public void setPurchasedCourses(String[] purchasedCourses) {
        this.purchasedCourses = purchasedCourses;
    }

    public String getToPurchasedCourses() {
        return toPurchasedCourses;
    }

    public void setToPurchasedCourses(String toPurchasedCourses) {
        this.toPurchasedCourses = toPurchasedCourses;
    }
}
