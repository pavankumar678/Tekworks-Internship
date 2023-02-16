import java.util.Scanner;
class percentage
  {
    public static void main(String arg[])
    {
      int py,ch,math,sc;
      System.out.println("enter your marks of py,ch,math,sc");
      Scanner d=new Scanner(System.in);
      py=d.nextInt();
      ch=d.nextInt();
      math=d.nextInt();
      sc=d.nextInt();
      float percentage=((py+ch+math+sc)%100);
      System.out.println("percentage is"+percentage);
      if(percentage>=90)
      {
        System.out.println("your grade is A");
      }
      else if(percentage>=80 && percentage<90)
      {
        System.out.println("your grade is B");
      }
      else if(percentage>=70 && percentage<80)
        {
         System.out.println("your grade is C");
        }
      else if(percentage>=60 && percentage<70)
        {
        System.out.println("your grade is D");
        }
      else
      {
       System.out.println("you are failed");  
      }
    }
  }