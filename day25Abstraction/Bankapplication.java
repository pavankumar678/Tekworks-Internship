import java.util.*;
interface bankservice
  {
    void services();
    void Mobilebanking();
    void ApplyforAccount();
    void Loans();
    void Helpline();
  }
 class serviceimplementation implements bankservice
  {
  public void services()
    {
      System.out.println("1.personal internetBanking");
      System.out.println("2.online tax/challan payment");
      System.out.println("3.payments");
      
    }
    public void Mobilebanking()
    {
      System.out.println("mobilebank");
    }
    public void Applyforaccount()
    {
      System.out.println("1.Savings account");
      System.out.println("2.current account");
    }
    public void Loans()
    {
      System.out.println("1.Home loan");
      System.out.println("2.Vehicle loan");
      System.out.println("3.personal loan");
    }
  
    public void Helpline()
    {
      System.out.println(" customer helpline no-xxxxxxxxxx ");
      Sysem.out.println("Tracking issueid-xxxxx");
    }
   
        
      }      
class Bankapplication
  {
    public static void main(String[] a)
    {
      serviceimplementation k=new serviceimplementation();
      k.services();
      k. Mobilebanking();
      k. Applyforaccount();
      k. Loans();
      k.Helpline();
    }
  }