package cards;

public class Gold extends BankCard {
    private int fixedAccount;
    private int bonus = 0;

    public Gold(String name, String surname, String cardNumber, int expirationYear, String cardType) {
        super(name, surname, cardNumber, expirationYear, cardType);
        fixedAccount = 100000;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getFixedAccount() {
        return fixedAccount;
    }

    public void payForLunch(int billOfLunch) {
        if (fixedAccount < billOfLunch) {
            System.out.println("Not enough money");
        } else if (fixedAccount <= 0) {
            System.out.println("Zero or negative balance");
        } else {
            fixedAccount -= billOfLunch;
        }
    }

    @Override
    public void withdrawMoney(int amount) {
        bonus += 2;
        super.withdrawMoney(amount);
    }

    //third task
    @Override
    public String toString() {
        return getName() + " " + getSurname() + " - " + getCardNumber() + " - " + getExpirationYear() + " - " + getCardType();
    }
}