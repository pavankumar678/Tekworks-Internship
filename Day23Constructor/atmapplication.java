import java.util.*;
class Account
  {
    long acc_no;
    double balance;
    String acc_holder_name;
    Account(long n1,double b1,String s)
    {
      acc_no=n1;
      balance=b1;
      acc_holder_name=s;
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
      Account s=new Account(1234567890,9998.97,"Pavan");
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