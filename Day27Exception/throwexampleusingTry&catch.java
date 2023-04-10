import java.util.*;
 
class FinalExample {
  public static void main(String a[]) 
  {
    Scanner p=new Scanner(System.in);
    System.out.println("enter balance");
    long balance=p.nextLong();
    try{
   if(balance<1000)
     throw new Exception("Minimum balance should be 1000");
   else if (balance >1000000)
      throw new Exception("You are exceding maximum limit");
    else
     System.out.println(balance);
    }
    catch(Exception d)
      {
        System.out.println(d);
      }
      
}
}
 