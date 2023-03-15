package Bany;

public class Chair {
    private int legs;
    private double length;
    private double width;

    public Chair(int legs, double length, double width) {
        this.legs = legs;
        this.length = length;
        this.width = width;
    }

    public double S() {
        return length * width;
    }

    public double P() {
        return 2 * (length + width);
    }

    public int getLegs() {
        return legs;
    }
}