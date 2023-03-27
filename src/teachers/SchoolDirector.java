package teachers;

public class SchoolDirector extends Teacher {
    private double administrativePoints;

    public SchoolDirector(String name, double salary, double administrativePoints) {
        super(name, salary);
        this.administrativePoints = administrativePoints;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + administrativePoints;
    }
}
