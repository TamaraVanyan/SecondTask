package Kitchen;

public class Gas {
    private int electricEyes;
    private int gasEyes;
    private boolean electricOn;
    private boolean gasOn;
    private int totalEnergy;

    public Gas(int electricEyes, int gasEyes) {
        setElectricEyes(electricEyes);
        setGasEyes(gasEyes);
    }

    public boolean isElectricOn() {
        return electricOn;
    }

    public void setElectricOn(boolean electricOn) {
        this.electricOn = electricOn;
    }

    public boolean isGasOn() {
        return gasOn;
    }

    public void setGasOn(boolean gasOn) {
        this.gasOn = gasOn;
    }

    public int getElectricEyes() {
        return electricEyes;
    }

    public void setElectricEyes(int electricEyes) {
        if (electricEyes >= 1 && electricEyes <= 3) {
            this.electricEyes = electricEyes;
        } else {
            System.out.println("Invalid number of electric eyes, it should be between 1 and 3.");
            System.exit(0);
        }
    }

    public int getGasEyes() {
        return gasEyes;
    }

    public void setGasEyes(int gasEyes) {
        if (gasEyes >= 3 && gasEyes <= 5) {
            this.gasEyes = gasEyes;
        } else {
            System.out.println("Invalid number of gas eyes, it should be between 3 and 5.");
            System.exit(0);
        }
    }

    public int getTotalEnergy() {
        totalEnergy = 0;
        if (electricOn) {
            totalEnergy += electricEyes * 100;
        }
        if (gasOn) {
            totalEnergy += gasEyes * 80;
        }
        return totalEnergy;
    }
}