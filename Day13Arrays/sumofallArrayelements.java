import java.util.*;
class sum
  {
    public static void main(String[] a)
    {
      int size;
      System.out.println("enter array size:");
      Scanner p=new Scanner(System.in);
      size=p.nextInt();
      int sumofelements[]=new int[size];
      System.out.println("enter your array elements:");
      for(int s=0;s<=size-1;s++)
        sumofelements[s]=p.nextInt();
        displaysum_of_elements(sumofelements,size);
    }
    public static void displaysum_of_elements(int sc[],int n)
    {
      int sum=0;
      for(int i=0;i<=sc.length;i++)
        {
          sum+=sc[i];
        }
      System.out.println("Sum of all ar")
    }