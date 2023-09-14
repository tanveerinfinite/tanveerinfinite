import java.util.*;
class BankAccount {
    private float balance;

    public BankAccount(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
class ATM
{
    private BankAccount account;
    public ATM(BankAccount account)
    {
        this.account=account;
    }
    public void menu()
    {
        System.out.println("WELCOME TO ATM !");
        System.out.println("1.WithDraw\n2.Deposit\n3.Balance\n4.Exit");
    }
    public void withDraw(float amount)
    {
        if(amount > account.getBalance())
        {
            System.out.println("WithDraw Failed...!");
        }

        else {
            account.setBalance(account.getBalance()-amount);
            {
                System.out.println("WithDraw Successful");
            }

        }




    }
    public void deposite(float amount)
    {
        account.setBalance(account.getBalance()+amount);
        System.out.println("Deposite Successful...");
    }
    public void checkBalance()
    {
        System.out.println("Current Balance = "+ account.getBalance());
    }

}



public class ATMInterface {

    public static void main(String[] args)
    {
        BankAccount account=new BankAccount(1000);
        ATM atm=new ATM(account);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            atm.menu();
            System.out.println("Enter your Choice=");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter Amount to Withdraw =" );
                    float withDraw=sc.nextFloat();
                    atm.withDraw(withDraw);
                    break;
                case 2:
                    System.out.println("Enter Amount To Deposite =");
                    float depositeAmount= sc.nextFloat();
                    atm.deposite(depositeAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING THE ATM...!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE,Please Try Again....");

            }
        }

    }
}
