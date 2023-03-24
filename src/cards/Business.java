package cards;

public class Business extends BankCard {
    private boolean canIncrease;
    int addCashback = 0;

    public Business(String name, String surname, String cardNumber, int expirationYear, String cardType) {
        super(name, surname, cardNumber, expirationYear, cardType);
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

    //third task
    @Override
    public String toString() {
        return getName() + " " + getSurname() + " - " + getCardNumber() + " - " + getExpirationYear() + " - " + getCardType();
    }
}