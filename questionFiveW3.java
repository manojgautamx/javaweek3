package workshop3;


public class questionFiveW3 {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    public questionFiveW3(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public void setAccountHolderAddress(String accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Holder Address: " + accountHolderAddress);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
    	questionFiveW3 account = new questionFiveW3("123456789", 1000.0, "John Doe", "123 Main St, City");
        account.displayAccountInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
    }
}

