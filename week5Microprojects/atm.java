//ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.
import java.util.*;
class Account
  {
    long acc_no;
    double balance;
    String acc_holder_name;
    void getdetails()
    {
      System.out.println("enter account details");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter account number");
      acc_no=sc.nextLong();
      System.out.println("enter your account balance");
      balance=sc.nextDouble();
      System.out.println("enter accountHolderName");
      acc_holder_name=sc.nextLine();
    }
    void deposit()
    {
     Scanner sp=new Scanner(System.in);
      System.out.println("enter amount u want to deposit");
      double amount=sp.nextDouble();
      balance=amount+balance;
      System.out.println("Deposited successfully");
      
     }
    void withdraw()
    {
     Scanner se=new Scanner(System.in);
      System.out.println("Enter amount to withdraw from ur account");
      double withdrawamount=se.nextDouble();
      balance=balance-withdrawamount;
      System.out.println("Please collect ur cash");
    }
    void checkbalance()
    {
     System.out.println("ur account balance:"+balance); 
    }
    
  }
class atmSimulator
  {
    public static void main(String[] a)
    {
      Account s=new Account();
      s.getdetails();
      System.out.println("which task u wan to perform?");
      System.out.println("1.Deposit");
      System.out.println("2.withdraw");
      System.out.println("3.checkbalance");
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      switch(i)
        {
          case 1:
           s.deposit();
            break;
          case 2:
            s.withdraw();
            break;
          case 3:
            s.checkbalance();
            break;
        }
    }
  }