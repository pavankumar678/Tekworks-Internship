import java.util.*;
class traffic
  {
    public static void main(String arg[])
    {
      do{
      int time;
      boolean decision;
      System.out.println("Do u want to check colour of trafficlight");
      Scanner p=new Scanner(System.in);
       decision=p.nextBoolean();
      System.out.println("Wts the second'sTime by ur watch:");
      time=s.nextInt();
        if(time>=1 && time<=20)
        {
          System.out.println("Green");
        }
        else if(time>20 && time<=40)
        {
          System.out.println("Red");
        }
        else if(time>40 && time<=60)
        {
          System.out.println("Orange");
        }
         else {
          System.out.println("enter valid time");
          }
      } 
        while(decision==true);
        }
  }
