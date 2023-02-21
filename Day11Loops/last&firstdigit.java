import java.util.*;
class firstandlastdigit
  {
    public static void main(String[] arg)
    {
      int n,p,q=0,a;
      System.out.println("Enter any number:");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      p=n%10;
      wihle(q>=10)
        {
         a=n%10;
         q=n/10;
        }
      System.out.println("first digit of given number:"+p);
      System.out.println("last digit of number:"+q);
      int sum=0;
      sum=p+q;
      System.out.println("Sum of first and last digit is"+sum);
    }
  }