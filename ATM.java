public class ATM {
    private double balance;
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount)
    {
        balance=balance-amount;
    }
    double getBalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        ATM obj=new ATM();

        obj.deposit(2000);

        obj.withdraw(500);

        System.out.println(obj.getBalance());
    }
}