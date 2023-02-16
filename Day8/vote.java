import java.util.Scanner;
class vote
  {
    public static void main(String arg[])
    {
      Scanner d=new  Scanner(System.in);
      int age;
      System.out.println("enter your age");
      age=d.nextInt();
      if(age>18)
      {
        System.out.println("you are eligible to vote");
      }
      else
      {
        System.out.println("you aren't eligible to vote");
      }
    }
  }