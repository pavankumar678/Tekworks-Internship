import java.util.*;
class Bankimplement implements Bank
  {
    ArrayList<BankData> bank=new ArrayList<>();
    public void insert()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter customer details suchas Holdername,AccNumber,InitialBalance");
      String name=sc.nextLine();
      String num=sc.nextLine();
      Double bal=sc.nextDouble();
      bank.add(name,num,bal);
    }
    public void delete()
    {
      Scanner sc=new Scanner(System.in);
      if(bank.size()==0)
        System.out.println("No data Available");
      else{
        String verify=null;
      System.out.println("Enter AccNumber to delete data");
        String dac=sc.nextLine();
        for(BankData b:bank)
          {
            if( b.getAcc_no()==dac)
              bank.remove(b);
            verify="found";
            break;
          }
        if(verify==null)
          System.out.println("no data found to delete");
      }
    }
    public void search()
    {
      Scanner sc=new Scanner(System.in);
      if(bank.size()==0)
        System.out.println("No data Available");
      else{
        String verify1=null;
      System.out.println("Enter AccNumber to delete data");
        String sac=sc.nextLine();
        for(BankData b:bank)
          {
            if( b.getAcc_no()==sac)
              System.out.println(b.getHolder_name()+" "+b.getAcc_no()+" "+b.getBalanace());
            verify1="found";
            break;
          }
        if(verify1==null)
          System.out.println("no data found to delete");
      }
    }
    public void display()
    {
       if(bank.size()==0)
        System.out.println("No data available");
      else
      {
      Iterator it=emp.iterator();
      while(it.hasNext())
        System.out.println(it.next());
    }
    }
  }