import java.util.*;
class armstrong
  {
    public static void main(String[] arg)
    {
      int number,sum=0,i,p=number;
      System.out.println("Enter any number:");
      Scanner s=new Scanner(System.in):
        number=s.nextInt();
      while(i>0)
        {
          i=p%10;
          p=number/10;
          sum=sum+(i*i*i);
          System.out.println(sum)
         }
       if(sum==number)
       {
         System.out.println("It is an Armstrong number");
       }
      else{
        System.out.println("It isn't an Armstrong number");
      }
    }
  }