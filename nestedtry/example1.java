import java.util.*;
class nestedtry
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      try{
        System.out.println(x/y);
        try{
          int a[]={1,2,3,4};
          System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e1)
          {
            System.out.println(e1);
          }
      }
      catch(ArithmeticException e2)
        {
          System.out.println(e2);
        }
    }
  }