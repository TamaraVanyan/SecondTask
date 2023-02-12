package Kitchen;

public class Main {
     public static void main(String[] args) {
        Gas gasMin = new Gas(1, 3);
       // Gas gasMin = new Gas(1, 2);

        System.out.println("Number of electric eyes: " + gasMin.getElectricEyes());
        System.out.println("Number of gas eyes: " + gasMin.getGasEyes());

        gasMin.setElectricOn(true);
        gasMin.setGasOn(true);
        System.out.println("Electric On: " + gasMin.isElectricOn());
        System.out.println("Gas On: " + gasMin.isGasOn());
        System.out.println("Total Energy: " + gasMin.getTotalEnergy());

        Gas gasMax = new Gas(3, 5);
        //Gas gasMax = new Gas(3, 8);
        System.out.println("Number of electric eyes: " + gasMax.getElectricEyes());
        System.out.println("Number of gas eyes: " + gasMax.getGasEyes());
        gasMax.setElectricOn(true);
        gasMax.setGasOn(false);
        System.out.println("Electric On: " + gasMax.isElectricOn());
        System.out.println("Gas On: " + gasMax.isGasOn());
        System.out.println("Total Energy: " + gasMax.getTotalEnergy());
    }
}
