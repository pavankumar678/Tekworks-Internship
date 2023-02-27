import java.util.*;
class arraycombination
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
        array[s]=p.nextInt();
       displayarray(array,size);
    }  
    static void displayarray(int arr[],int s)
    {
      int count0=0,count2=0,count1=0;
      for(int i=0;i<=s-1;i++)
        {
         if(arr[i]==0)
         {
           count0++;
         }
        if(arr[i]==2)
            {
            count2++;
            }
          if(arr[i]==1)
          {
            count1++;
          }
        }
      for(int i=0;i<count0;i++)
        {
          arr[i]=0;
        }
       for(int i=count0;i<count0+count2;i++)
        {
          arr[i]=2;
        }
      for(int i=count2+count1;i<s;i++)
        {
          arr[i]=1;
        }
      
      for(int i=0;i<=s-1;i++)
        {
          System.out.print(arr[i]+" ");
        }
         
    }
  }