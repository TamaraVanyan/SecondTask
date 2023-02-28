package footballClub;

public class FootballPlayer {
    private String name;
    private String surname;
    private String position;
    private String nationality;
    private int number;
    private int age;

    public FootballPlayer(String name, String surname, String position, String nationality, int number, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.nationality = nationality;
        this.number = number;
        if (number < 0 || number > 11) {
            System.out.println("In football club there are 11 player");
            System.exit(11);
        }
        this.age = age;
        if (age < 6 || age > 60) {
            System.out.println("There are not players in this age");
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public int getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
}