import java.util.*;
class unique
  {
    public static void main(String[] ar)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int array[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        array[s]=p.nextInt();
       duplicate_element(array,size);
    }
    static void duplicate_element(int a[],int n)
    {
      int count=0;
      
    }
  }