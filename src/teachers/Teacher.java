package teachers;

public class Teacher {
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}