package homework;

import com.sun.jdi.ClassObjectReference;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Ahmet", "Mehmet", "ahmetmehmet@ahmetmehmet.co", "1234456789");
        User user2 = new User(2, "Mehmet", "Ahmet", "mehmetahmet@mehmetahmet.co", "9874456321");

        User[] users = {user1, user2};
        UserManager userManager = new UserManager();
        userManager.add(user1);
        userManager.delete(user1);
        userManager.update(user1);
        userManager.addMultiple(users);
        userManager.login(user1);
        userManager.logout(user1);
        userManager.getAllUsers(user1);
        userManager.getUserById(user1);

        String student1Cours[] = {"Java", "PHP"};
        Student student1 = new Student(5, "Ahmet", "Mehmet", "ahmetmehmet@ahmetmehmet.co", "12345678", 1, "python", student1Cours);

        String student2Cours[] = {"C++", "JS"};
        Student student2 = new Student();
        student2.setId(6);
        student2.setFirstName("Mehmet");
        student2.setLastName("Ahmet");
        student2.setEmail("mehmetahmet@mehmetahmet.co");
        student2.setPassword("87654321");
        student2.setStudentId(2);
        student2.setPurchasedCourses(student2Cours);
        student2.setToPurchasedCourses("c#");

        Student[] students = {student1, student2};

        StudentManager studentManager = new StudentManager();
        studentManager.delete(student2);
        studentManager.add(student1);
        studentManager.addMultiple(students);

        Instructor instructor = new Instructor(6, "Ahmet", "Mehmet", "ahmetmehmet@ahmetmehmet.co", "12345678", 1, "Mükemmel bir kurs", "Mükemmel kursun detayı", 4.5);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.delete(instructor);

    }


}
