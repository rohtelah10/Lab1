class Bank {
    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String result = (amount >= withdrawalAmount) ? "Withdrawal successful" : "Insufficient funds";
        
        amount = (amount >= withdrawalAmount) ? (amount - withdrawalAmount) : amount;
        
        System.out.println(result);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
}
public class ajp1{
    public static void main(String[] args) {

        Bank bankAccount = new Bank(10000);

        bankAccount.withdraw(3000);
        bankAccount.deposit(5000);
        bankAccount.displayBalance();
    }
}