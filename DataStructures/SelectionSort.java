import java.util.*;
class selectionsort
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=s.nextInt();
      int a[]=new int[size];
      System.out.println("Enter array elements");
      for(int s=0;s<size;s++)
        a[s]=sc.nextInt();
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              int temp=0;
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
          System.out.println(a[i]);
        }
    }
  }