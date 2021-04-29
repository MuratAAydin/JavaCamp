package homework;

public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " tebrikler " + instructor.getCourseName() + " adın da bir kurs oluşturdunuz. Kursun detayı: " + instructor.getCourseDetail());
        System.out.println();
    }

    public void delete(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " başarılı " + instructor.getCourseName() + " adlı kursunuz başarıyla silindi! Kursunuzun puanı " + instructor.getCourseRate());
    }
}
