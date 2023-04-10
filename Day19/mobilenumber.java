//Check whether the given mobile number is valid or not
import java.util.*;
class mobileno
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter mobilenumber");
      String l=sc.nextLine();
      int q=valid(l);
      if(q==1)
      {
        System.out.println("It's valid mobilenumber");
      }
      else{
        System.out.println("It's invalid mobilenumber");
      }
      
    }
    public static int valid(String L)
    {
       int count=0;
      for(int i=0;i<=L.length()-1;i++)
        {
          if(L.charAt(i)>='0' && L.charAt(i)<='9')
          {
            count=count+1;
          }
          else{
            System.out.println("invalid mobilenumber");
          }
        }
      if(count==10)
      {
        return 1;
      }
      else{
        return 0;
      }
    }
  }