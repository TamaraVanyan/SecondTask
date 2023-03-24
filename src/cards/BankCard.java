package cards;

public class BankCard {
    private String name;
    private String surname;
    private String cardNumber;
    private int expirationYear;
    private String cardType;
    private int balance;

    public BankCard(String cardType) {
        this.cardType = cardType;
        this.balance = 0;
    }

    public BankCard(String name, String surname, String cardNumber, int expirationYear, String cardType) {
        this.name = name;
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
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
        if (amount > balance) {
            System.out.println("Not enough balance");
            System.exit(2);
        } else if (balance < 0) {
            System.out.println("Negative balance");
            System.exit(2);
        } else if (balance == 0) {
            System.out.println("Your balance is 0");
        } else {
            balance -= amount;
        }
    }

    //second task
    public void makeOnlinePurchase(int amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
            System.exit(2);
        } else if (balance < 0) {
            System.out.println("Negative balance");
            System.exit(2);
        } else if (balance == 0) {
            System.out.println("Your balance is 0");
        } else {
            balance -= amount;
        }
    }
}