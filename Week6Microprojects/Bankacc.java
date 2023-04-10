//Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.*;
class BankAccount
  {
    Double Bankbalance;
   void getbalance()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter ur Bankbalance");
      try{
        Bankbalance=sc.nextDouble();
      }
      catch(InputMissMatchException e)
        {
          System.out.println("enter valid Data only");
        }
    }
    void deposit()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to deposit");
      try
        {
      Double amount1=sc.nextDouble();
        }
      catch(InputMissMatchException e)
        {
          System.out.println(e);
        }
      Bankbalance=Bankbalance+amount1;
    }
    void withdraw() throws Exception
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to withdraw");
      try
        {
      double amount2=sc.nextDouble();
        }
      catch(InputMissMatchException e)
        {
          System.out.println(e);
        }
      if(amount2>Bankbalance)
        throw new Exception("Insufficient Funds Exception");
      else
        Bankbalance=Bankbalance-amount2;
    }
    void checkbalance()
    {
      System.out.println("Your bankbalance is"+Bankbalance);
    }
  }
class MainAccount
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of customers");
      int n=sc.nextInt();
      BankAccount b[]=new BankAccount[n];
      for(int i=0;i<n;i++)
        {
          b[i]=new BankAccount();
          b[i].getbalance();
          b[i].deposit();
          b[i].withdraw();
          b[i].checkbalance();
          
        }
     
      
  }