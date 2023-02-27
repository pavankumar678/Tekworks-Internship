import java.util.*;
class notes
  {
    public static void main(String arg[])
    {
      int amount;
      System.out.println("enter amount");
      Scanner s=new Scanner(System.in);
      amount=s.nextInt();
      int arr[]={2000,500,200,100,50,20,10};
       int temp=amount;
      for(int i=0;i<7;i++)
        {
          System.out.println("Number of "+arr[i]+" notes = "+temp / arr[i]);
             temp = temp % arr[i];
        }
    }
  }