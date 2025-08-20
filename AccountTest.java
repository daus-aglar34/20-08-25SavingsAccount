public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.balance = 0;
        sa0001.deposit(5000);
        sa0001.name = "Damien";
        sa0001.balance += 0.83;

        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";

        SavingsAccount sa0003 = new SavingsAccount();
        sa0003.balance = 3000;
        sa0003.name = "John";

        sa0001.displayCustomer();
        System.out.println(sa0001.calcInterest());
    }
}
