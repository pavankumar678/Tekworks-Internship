import java.util.*;
class insertionsort
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements");
      for(int s=0;s<size;s++)
        {
          arr[s]=sc.nextInt();
        }
      for(int i=1;i<arr.length;i++)
        {
          int key=arr[i];
          int k=i-1;
          while(k>=0 && arr[k]>key)
            {
              arr[k+1]=arr[k];
              k=k-1;
            }
          arr[k+1]=key;
          System.out.println("pass"+i);
          System.out.println(arr[i]);
        }
      
    }
  }