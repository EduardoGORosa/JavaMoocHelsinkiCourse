
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthews = new Account("Matthews account", 1000.00);
        Account mine = new Account("My account", 0.00);
        matthews.withdrawal(100.00);
        mine.deposit(100.00);
        System.out.println(matthews);
        System.out.println(mine);
    }
}
