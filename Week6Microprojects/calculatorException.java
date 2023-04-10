//Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.
import java.util.*;
class calculator
  {
    int a;
    int b;
    calculator(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    void addition() throws Exception
    {
      if(a<0 || b<0)
        throw new Exception("InvalidExpressionException");
      else
        System.out.println("addition of a&b:"+(a+b));
    }
    void subtraction() throws Exception
    {
      if(a<b)
       throw new Exception("InvalidExpressionException");
      else
        System.out.println("Subtraction of a&b:"+(a-b));
    }
    void multiplication() throws Exception
    {
      if(a<0 || b<0)
        throw new Exception("InvalidExpressionException");
      else
        System.out.println("Multiplication of a&b:"+(a*b));
    }
    void Divison() throws Exception
    {
      if(b>a)
        throw new Exception("InvalidExpressionException");
      else
        System.out.println("Divison of a&b:"+(a/b));
    }
  }
class MainCal
  {
    public static void main(String[] k)
    {
      Scanner sc=new Scanner(System.in);
      Boolean f;
      do{
      System.out.println("enter any two values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      calculator c=new calculator(a,b);
        System.out.println("which arthimetic operation do u want to perfrom?");
        System.out.println("1.+  2.-  3.*  4./");
        int i=sc.nextInt();
        switch(i)
          {
            case 1:
              c.addition();
              break;
            case 2:
              c.subtraction();
              break;
            case 3:
              c.multiplication();
              break;
            case 4:
              c.divison();
              break;
          }
        System.out.println("do u want to use calculator?")
          f=sc.nextBoolean();
        }
        while(f==true);
    }
  }