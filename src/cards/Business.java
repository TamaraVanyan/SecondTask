package cards;

public class Business extends BankCard {
    private boolean canIncrease;

    public Business() {
        super("Business");
        canIncrease = true;
    }

    public void increaseLimit() {
        if (canIncrease) {
            addMoney(1000000);
            canIncrease = false;
        }
    }
}