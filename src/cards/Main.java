package cards;

public class Main {
    public static void main(String[] args) {
        Standards standardCard = new Standards("123456789");
        standardCard.addMoney(5000);
        standardCard.withdrawMoney(2000);
        System.out.println("Standard card balance: " + standardCard.getBalance());

        Business businessCard = new Business();
        businessCard.increaseLimit();
        businessCard.increaseLimit(); //it's not increase balanse second time
        businessCard.withdrawMoney(200000);
        System.out.println("Business card balance: " + businessCard.getBalance());


        Gold goldCard = new Gold();
        goldCard.addMoney(180000);
        goldCard.payForLunch(5000);
        goldCard.withdrawMoney(5000);
        goldCard.payForLunch(8000);
        goldCard.withdrawMoney(15000);
        goldCard.payForLunch(8700);
        System.out.println("Gold card fixed balance after payning for lunch: " + goldCard.getFixedAccount());
        System.out.println("Gold card balance: " + goldCard.getBalance());
    }

}