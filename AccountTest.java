import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount sa0001 = new SavingsAccount();
        System.out.println("Enter the Deposit Amount:");
        int depositAmount = input.nextInt();

        System.out.println("Enter the Withdrawal Amount:");
        int withdrawalAmount = input.nextInt();
        sa0001.balance = 0;
        sa0001.deposit(depositAmount);
        sa0001.withdraw(withdrawalAmount);
        sa0001.name = "Damien";
        sa0001.balance += 0.83;

        sa0001.displayCustomer();
        System.out.println(sa0001.calcInterest());

        input.close();
    }
}
