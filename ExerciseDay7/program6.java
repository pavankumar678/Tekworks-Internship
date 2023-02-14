import java.util.*;
class divisibility
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int a;
      a=nextInt();
      if(a%5==0)
      {
        if(a%11==0)
        {
          System.out.println("a is divisible by both 5&11"+a);
        }
        else
        {
          System.out.println("a is divisible by only 5"+a);
        }
      }
      else
      {
        System.out.println("a isn't divisible by both 5&11"+a);
      }
    }
  }