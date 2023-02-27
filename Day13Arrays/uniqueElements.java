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
       unique_element(array,size);
    }
    static void unique_element(int ps[],int n)
    {
      int i=0,count=0,current_element=0;
      while(i<n)
        {
      while(i<n && current_element==ps[i])
        {
          count++;
          i++;
        }
        }
      if(count==1)
      {
        System.out.println(current_element+"")
      }
    }
    }
  