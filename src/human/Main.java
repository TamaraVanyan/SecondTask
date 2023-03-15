package human;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vazgen", "Mkhitaryan", 24, "Mozanbik", "094-45-45-05");
        Employee employee = new Employee("Anna", "Petrosyan", 25, "some street",
                "456998", "QA engeneer", 900000);
        Manager manager = new Manager("Ara", "Aramyan", 40, "Abovyan", "33-33-33-33",
                "devops", 1200000, "softwere engeneering");

        System.out.println("Person: " + person.getName() + " " + person.getSurname() + ", " + person.getAge() + ", "
                + person.getAddress() + ", " + person.getPhoneNumber());
        System.out.println("Employee: " + employee.getName() + " " + employee.getSurname() + ", " + employee.getAge() +
                ", " + employee.getAddress() + ", " + employee.getPhoneNumber() + ", " + employee.getSpecialization() + ", " + employee.getSalary());
        System.out.println("Manager: " + manager.getName() + " " + manager.getSurname() + ", " + manager.getAge() + ", " +
                manager.getAddress() + ", " + manager.getPhoneNumber() + ", " + manager.getSpecialization() + ", " + manager.getSalary() + ", " + manager.getDepartment());
    }
}
