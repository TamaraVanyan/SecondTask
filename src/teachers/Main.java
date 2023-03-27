package teachers;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Varditer Petrosyan", 65000);
        HeadTeacher headTeacher = new HeadTeacher("Mary Poghosyan", 70000, 1.7);
        SchoolDirector schoolDirector = new SchoolDirector("David Ghazaryan", 90000, 30000);

        System.out.println("Teacher Salary: " + teacher.getSalary());
        System.out.println("Head Teacher Salary: " + headTeacher.getSalary());
        System.out.println("School Director Salary: " + schoolDirector.getSalary());

        printTeacherSalary(teacher);
        printTeacherSalary(headTeacher);
        printTeacherSalary(schoolDirector);
    }

    public static void printTeacherSalary(Teacher teacher) {
        System.out.println(teacher.getName() + " Salary: " + teacher.getSalary());
    }
}