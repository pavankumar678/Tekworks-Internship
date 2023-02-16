import java.util.*;
class calculator
  {
    public static void main(String arg[])
    {
      char operator;
      boolean decision;
      System.out.println("Do u want use calculator");
      Scanner p=new Scanner(System.in);
      decision=p.nextBoolean();
      do{
      double n1,n2;
      System.out.println("choose an operator +,-,*,/,%");
      operator=p.next().charAt(0);
      System.out.println("enter your 1st number");
      n1=p.nextDouble();
      System.out.println("enter your 2nd number");
      n2=p.nextDouble();
      Calculator c=new Calculator();
      switch(operator)
        {
          case '+':
            double addresult=c.addition(n1,n2);
            System.out.println("your result is"+addresult);
            break;
          case '-':
            double subresult=c.subtraction(n1,n2);
            System.out.println("your result is"+subresult);
            break;
          case '*':
            double mulresult=c.multiplication(n1,n2);
             System.out.println("your result is"+mulresult);
            break;
          case '/':
            double divresult=c.divison(n1,n2);
             System.out.println("your result is"+divresult);
            break;
          case '%':
            double modresult=c.modulus(n1,n2);
             System.out.println("your result is"+modresult);
            break;
          default:
            System.out.println("invalid operator");
            break;
        }
      }
        while(decision=true);
    }
    double  addition(double n1,double n2)
  {
    return n1+n2;
  }
  double substraction(double n1,double n2)
  {
    return n1-n2;
  }
  double multiplication(double n1,double n2)
  {
        return n1*n2;
  }
double  modulo(double n1,double number2)
  {
        return n1%n2;
  }
  double division(double n1,double number2 )
  {
    return n1/n2;
  }
}
  