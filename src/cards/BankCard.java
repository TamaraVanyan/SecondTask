package cards;
public class BankCard {
    private String cardType;
    private int balance;

    public BankCard(String cardType) {
        this.cardType = cardType;
        this.balance = 0;
    }

    public String getCardType() {
        return cardType;
    }

    public int getBalance() {
        return balance;
    }

    public void addMoney(int amount) {
        balance += amount;
    }

    public void withdrawMoney(int amount) {
        if (balance < 0 || amount > balance){
            System.out.println("Not enought balance");
            System.exit(2);
        }
        if(balance == 0){
            System.out.println("Your balance is 0");
        }
        balance -= amount;
    }
}