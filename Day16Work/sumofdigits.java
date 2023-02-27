import java.util.*;
class sum
  {
    public static void main(String[] a)
    {
      Long n;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter 10 digit number");
      n=s.nextLong();
      int r=sumofdigits(n);
      System.out.println("Sum of specified digits:"+r);
    }
    static int sumofdigits(long a)
    {
      int sum=0;
      while(a > 0)
      {
        for(int i=0;i<=10;i++)
          {
            int p=a%10;
            a=a/10;
          System.out.println("Position of"+p+"is"+i);
          }
      }
      sum=
      return sum;
    }
  }