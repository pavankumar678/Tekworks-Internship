import java.util.*;
class twoDarray
  {
    public static void main(String arg[])
    {
      int row,col;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter row size");
      row=s.nextInt();
      System.out.println("Enter column size");
      col=s.nextInt();
      System.out.println("enter array elements");
      arr[row][col]=s.nextInt();
      displayarrayelements(arr,row,col);
    }
    static void displayarrayelements(int a[][],int n1,int n2)
    {
      for(int i=0;i<n1;i++)
        {
          for(int j=0;j<n2;j++)
            {
              System.out.println(i);
               System.out.println(j);
              
            }
        }
    }
  }