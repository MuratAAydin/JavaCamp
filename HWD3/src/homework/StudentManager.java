package homework;

public class StudentManager {
    public void add(Student student) {
        int purchasedCoursesLength = student.getPurchasedCourses().length;
        int nowPurchasedCourses = student.getPurchasedCourses().length + 1;
        System.out.println("" + student.getFirstName() + " " + student.getLastName() + " adlı kullanıcı " + student.getToPurchasedCourses() + " Kursunu satın aldı! Artık " + nowPurchasedCourses + " kursa sahip. ");
        System.out.println("Sahip olduğu kurslar:");
        for (int i = 0; i < purchasedCoursesLength; i++) {
            System.out.println(student.getPurchasedCourses()[i] + " ");
        }
        System.out.println(student.getToPurchasedCourses());
        System.out.println();
    }

    public void addMultiple(Student[] students) {
        for (Student student : students) {
            add(student);
        }
        System.out.println();
    }

    public void delete(Student student) {
        int purchasedCoursesLength = student.getPurchasedCourses().length;
        System.out.println("" + student.getFirstName() + " " + student.getLastName() + " adlı kullanıcı " + student.getToPurchasedCourses() + " Kurstan ayrıldı! Artık " + purchasedCoursesLength + " kursa sahip. ");
        System.out.println("Sahip olduğu kurslar:");
        for (int i = 0; i < purchasedCoursesLength; i++) {
            System.out.println(student.getPurchasedCourses()[i] + " ");
        }
        System.out.println();
    }
}
