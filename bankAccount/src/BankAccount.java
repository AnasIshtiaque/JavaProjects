public class BankAccount
{
    public String name;
    public String number;
    private String password;
    private double balance;

    public BankAccount(String name, String number, String password)
    {
        this.name = name;
        this.number = number;
        this.password = password;
        this.balance = 0;
    }


    public void deposit(double amount)
    {
        //this.balance = amount + balance; is the same as...
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public double getBalance()
    {
        return balance;
    }



    public static void main(String[] args)
    {
        String name = "James Smith";
        String accountNum = "123 456 789 0";
        String password = "password123";

        BankAccount myAccount = new BankAccount(name, accountNum, password);
        System.out.printf("Balance: $%8.2f\n", myAccount.getBalance());

        myAccount.deposit(100.00);
        System.out.printf("Balance: $%8.2f\n", myAccount.getBalance());

        myAccount.withdraw(12.89);
        System.out.printf("Balance: $%8.2f\n", myAccount.getBalance());
    }

}