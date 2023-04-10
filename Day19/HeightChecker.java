import java.util.*;
class heightchecker
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter test cases u wanna perform");
      int T=sc.nextInt();
      while(T!=0)
        {
           System.out.println("enter first person height");
          int x=sc.nextInt();
           System.out.println("enter second person height");
          int y=sc.nextInt();
          if(x>y)
            System.out.println("a");
          else{
            System.out.println("b");
          }
          T--;
        }
    }
  }