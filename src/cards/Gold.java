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
        if (billOfLunch <= fixedAccount) {
            System.out.println("Not enought money");
        } else if (fixedAccount < 0) {
            System.out.println("Negative balance");
        } else {
            fixedAccount = fixedAccount - billOfLunch;
            //System.out.println("Paid for lunch using Gold card! " + billOfLunch);
        }
    }
}