package cards;

public class Gold extends BankCard {
    private int fixedAccount;

    public Gold() {
        super("Gold");
        fixedAccount = 100000;
    }

    public int getFixedAccount() {
        return fixedAccount;
    }

    public void payForLunch(int billOfLunch) {
        if (billOfLunch <= fixedAccount && fixedAccount > 0) {
            fixedAccount = fixedAccount - billOfLunch;
            //System.out.println("Paid for lunch using Gold card! " + billOfLunch);
        } else {
            System.out.println("Not enough balance to pay for lunch.");
        }
    }
}