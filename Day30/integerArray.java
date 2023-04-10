import java.util.*;
class InvalidIntegerException extends Excepton
  {
  public InvalidIntegerException(String message)
    {
    super(message);
    }
}
class IntegerArray
  {
    int size;
    int array[];
    void read()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array");
      size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("Enter array Elements");
     for(int i=0;i<size;i++)
       {
         try
           {
             array[i]=sc.nextInt();
           }
         catch(InvalidIntegerException e)
           {
             System.out.println("Enter IntegerData only");
           }
       }
    }
    void  typeofelement()
    {
      for(int j=0;j<=size-1;j++)
        {
          if(array[j]==0)
            System.out.println("this element is zero");
          else if(array[j]>0)
            System.out.println("this element is a positive number");
          else
            System.out.println("this element is a negative number");
        
        }
    }
  }
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of test cases");
      int k=sc.nextInt();
     IntegerArray r[]=new IntegerArray[k];
       for(int i=0;i<k;i++)
         {
           r[i]=new IntegerArray();
           r[i].read();
           r[i].typeofelement();
         }
        
    }
  }