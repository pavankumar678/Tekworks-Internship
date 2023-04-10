import java.util.*;
class BankMain
  {
    public static void main(String[] arg)
    {
       Scanner sc=new Scanner(System.in);
      Bankimplement b1=new Bankimplement();
      char ch;
      System.out.println("1.Add Customer");       
     System.out.println("2.Delete  Customer");       
     System.out.println("3.Search Customer");       
     System.out.println("4.Display  Customers");
      do{
        System.out.println("Enter choice?");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
             b1.insert();
              break;
            case 2:
             b1.delete();
              break;
            case 3:
             b1.search();
              break;
            case 4:
              b1.display();
              break;
            default:
            System.out.println("invalid option");
          }
      
        System.out.println("do you want to continue?");
      ch=sc.next().charAt(0);
        
      }while(ch!='n');
    }
  }