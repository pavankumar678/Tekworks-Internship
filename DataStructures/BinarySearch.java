import java.util.*;
class Main
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter arraysize");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              int temp=0;
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
     int l= BinarySearch(arr,size);
      if(l==-1)
        System.out.println("KeyElement not found");
      else
        System.out.println("Keyelement found at"+l+"index number");
    }
    static int BinarySearch(int arr1[],int n)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter keyElement to search");
      int key=sc.nextInt();
      int location=-1,first=0,last=n-1;
      while(first<=last)
        {
          int middle=(first+last)/2;
          if(key==arr1[middle])
          {
            location=middle;
            break;
          }
          else if(key<arr1[middle])
          {
            last=middle-1;
          }
          else
            first=middle+1;
        }
      return location;
    }
  }