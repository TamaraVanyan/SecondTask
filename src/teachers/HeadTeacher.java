package teachers;

public class HeadTeacher extends Teacher {
    private double coefficient;

    public HeadTeacher(String name, double salary, double coefficient) {
        super(name, salary);
        setCoefficient(coefficient);
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        if (coefficient >= 1.5 && coefficient <= 2) {
            this.coefficient = coefficient;
        } else {
            System.out.println("Coefficient should be in range 1.5-2");
            System.exit(2);
        }
    }

    public double getSalary() {
        return super.getSalary() * coefficient;
    }
}
