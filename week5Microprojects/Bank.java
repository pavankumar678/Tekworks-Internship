// Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.*/
import java.util.*;
class Bankaccount
  {
   long acc_no;
    double balance;
    String acc_holder_name;
  }
class checkingacccount extends Bankaccount
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ur account type:");
    String type=sc.nextLine();
    Switch(type)
      {
      case savings:
       deposit();
       withdraw();
       checkbalance();
      case current:
       deposit();
      withdraw();
      checkbalance();
      }
  }
