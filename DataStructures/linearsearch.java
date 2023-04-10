import java.util.*;
class linearsearch
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<=size-1;i++)
        arr[i]=sc.nextInt();
      System.out.println("enter search element");
      int se=sc.nextInt();
      String verify=null;
      for(int j=0;j<arr.length;j++)
        {
          if(arr[j]==se){
            verify="found";
          break;}
          else
            verify=null;
        }
      if(verify==null)
        System.out.println("Element not found");
      else
        System.out.println("element found");
    
    }
  }