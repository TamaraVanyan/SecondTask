package cards;

public class Business extends BankCard {
    private boolean canIncrease;
    int addCashback = 0;

    public Business() {
        super("Business");
        canIncrease = true;
        this.addCashback = addCashback;
    }

    public int getAddCashback() {
        return addCashback;
    }

    public void increaseLimit() {
        if (canIncrease) {
            addMoney(1000000);
            canIncrease = false;
        }
    }
    @Override
    public void makeOnlinePurchase(int amount) {
        addCashback += (amount * 10 / 100);
        super.makeOnlinePurchase(amount);
    }
}