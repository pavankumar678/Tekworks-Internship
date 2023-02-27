import java.util.*;
class Secondlargestandleast
  {
    public static void main(String[] a)
    {
       int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int arr[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        arr[s]=p.nextInt();
       secondlargestandleast(arr,size);
    }
    static void secondlargestandleast(int a[],int  n)
    {
      int min=a[i],temp=0,i;
      for( i=0;i<=n;i++)
      {
       min=temp;
       a[i]=min;
       temp=a[i];
      }
        System.out.println(a[i]);
      System.out.println("Second Smallest element :"+a[1]);
      System.out.println("Second largest element:"+a[n-2]);
    }
  }