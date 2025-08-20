public class SavingsAccount {

    public double balance;
    public double interestRate = 0.01;
    public String name;

    public void deposit(int x) {
        balance += x;
    }

    public double calcInterest(){
        double interest = balance * interestRate / 12;
        return interest;
    }



    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}