import java.util.*;
class stringpermutation
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter string data");
      String str=sc.nextLine();
      permutation(str);
    }
    static void permutation(String str1)
    {
      if(str1.length()==0)
        System.out.println(" ");
      else{
        String arr[]=str1.toCharArray();
        for(int i=0;i<arr.length;i++)
          {
            char ch=arr[i];
            char temp=arr[i+1];
            arr[i+1]=arr[arr.length-1];
            arr[arr.length-1]=arr[i+1];
            
          }
      }
    }
  }