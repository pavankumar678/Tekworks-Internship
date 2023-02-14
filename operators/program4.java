import java.util.Scanner;
class maximumof3
  {
    public static void main(Strin arg[])
    {
     Scanner d=new Scanner(System.in);
      System.out.println("enter values a,b,c");
      a=d.nextInt();
      b=d.nextInt();
      c=d.nextInt();
      if(a>b && a>c)
      {
        System.out.println('a is maximum'+a);
      }
      elseif(b>c)
        {
        System.out.println("b is maximum"+b);
        }
      else
      {System.out.println("c is maximum"+c);
      }
     }
    }  
  }