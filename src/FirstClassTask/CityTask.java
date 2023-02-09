package FirstClassTask;

import java.util.Scanner;

public class CityTask {
    static class City {
        String name = "Not defined";
        String country;
        int population;
        int age;

        City(String n, int p, String c, int a) {
            //name = n;
            population = p;
            country = c;
            age = a;
        }

    }

    public static void main(String[] args) {
        City city1 = new CityTask.City("Goris", 20000, "Armenia", 300);
        if (city1.name.equals("Not defined")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter city name: ");
            city1.name = scanner.nextLine();
        }
        System.out.println("City name is: " + city1.name);
        System.out.println("Country: " + city1.country);
        System.out.println("Population: " + city1.population);
        System.out.println("Age of city: " + city1.age);
    }
}
