package human;

public class Employee extends Person {
    String specialization;
    double salary;

    public Employee(String name, String surname, int age, String address, String phoneNumber, String specialization, double salary) {
        super(name, surname, age, address, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
