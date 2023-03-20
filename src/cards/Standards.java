package cards;

public class Standards extends BankCard {
    public Standards(String cardNumber) {

        super("Standart");
    }

    public String getType() {

        return "Standard";
    }

    public boolean increaseLimit() {

        return false;
    }

}