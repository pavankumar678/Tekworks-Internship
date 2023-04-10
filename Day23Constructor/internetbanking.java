import java.util.*;
class internetbanking
  {
    String username;
    String password;
    String IFSCcode;
    internetbanking(String p,String q,String r)
    {
      username=p;
      password=q;
      IFSCcode=r;
    }
    void verify()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter username ");
      String p1=sc.nextLine();
      System.out.println("Enter Password ");
      String q1=sc.nextLine();
      if(p1.equals(username))
      {
        if(q1.equals(password))
        
        System.out.println("You are an authorized User");
        
      }
      else{
        System.out.println("enter valid details");
      }
    }
    
  }
class Mainbanking
  {
    public static void main(String[] a)
    {
      internetbanking sc=new internetbanking("pavan678","pavan@1234","SBIN00");
      sc.verify();
    }
  }