import java.util.*;
class diagonalelements
  {
    public static void main(String[] a)
    {
      int row,col;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter row size");
      row=s.nextInt();
      System.out.println("Enter column size");
      col=s.nextInt();
      int arr1[][]=new int[row1][col1];
      System.out.println("enter array elements");
      for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++)
      arr1[row1][col1]=s.nextInt();
        displaydiagonal(arr,row,col);
      }
    }
      static void displaydiagonal(int a[][],int r1,int c1)
        {
        if(r1==c1)
        {
          for(int i=0;i<n;i++)
              {
             for(int j=0;j<n;j++)
               {
                 System.out.println(a[i][j]+","+"");
               }
              }
        }
        }
    }
    