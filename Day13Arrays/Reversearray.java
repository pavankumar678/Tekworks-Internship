import java.util.*;
class reverse
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int array[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        array[s]=p.nextInt();
       reversearray(array,size);
    }
    static void revesearray(int ds[],int n)
    {
      int temp=0;
      for(int i=0;i<n/2;i++)
        {
          temp=ds[i];
          ds[i]=ds[n-1-i];
          ds[n-1-i]=temp;
        }
    }
  }