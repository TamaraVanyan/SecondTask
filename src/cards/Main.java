package cards;

public class Main {
    public static void main(String[] args) {
        Standards standardCard = new Standards("123456789");
        standardCard.addMoney(5000);
        standardCard.withdrawMoney(2000);
        System.out.println("Standard card balance: " + standardCard.getBalance());

        Business businessCard = new Business("Vazgen", "Vardanyan", "12254525898", 2025, "Buisness");
        businessCard.increaseLimit();
        businessCard.increaseLimit(); //it's not increase balance second time
        businessCard.withdrawMoney(200000);
        System.out.println("Business card balance: " + businessCard.getBalance());
        //second task
        System.out.println("______________________");
        businessCard.makeOnlinePurchase(5000);
        System.out.println("Your cashback from online purchase: " + businessCard.getAddCashback());
        //third task
        System.out.println(businessCard);
        System.out.println("-----------------------");


        Gold goldCard = new Gold("Anna", "Karapetyan", "4589632525", 2027, "Gold");
        goldCard.addMoney(180000);
        goldCard.payForLunch(5000);
        goldCard.withdrawMoney(5000);
        goldCard.payForLunch(8000);
        goldCard.withdrawMoney(15000);
        goldCard.payForLunch(8700);
        System.out.println(goldCard.getBalance());
        System.out.println("Gold card fixed balance after payning for lunch: " + goldCard.getFixedAccount());
        System.out.println("Gold card balance: " + goldCard.getBalance());
        System.out.println("_____________________________");
        System.out.println("Your bonus is: " + goldCard.getBonus());
        //third task
        System.out.println(goldCard);
    }
}