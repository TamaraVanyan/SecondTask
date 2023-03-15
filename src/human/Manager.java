package human;

public class Manager extends Employee {
    String department;

    public Manager(String name, String surname, int age, String address, String phoneNumber, String specialization, double salary, String department) {
        super(name, surname, age, address, phoneNumber, specialization, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}