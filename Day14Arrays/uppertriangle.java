import java.util.*;
class uppertriangleelements
  {
    public static void main(String[] a)
    {
      int row,col;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter row size");
      row=s.nextInt();
      System.out.println("Enter column size");
      col=s.nextInt();
      int arr[][]=new int[row][col];
      System.out.println("enter array elements");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++)
      arr[row][col]=s.nextInt();
      }
        displayuppertriangleelements(arr,row,col);
      
    }
    static void displayuppertriangleelements(int a[][],int r1,int c1)
    {
      int i,j;
      if(r1==c1)
      
      {
        for(i=0;i<r1;i++)
          for(j=0;j<c1;j++)
            if((i+j)<r1)
            {
              System.out.println(a[i][j]+"\t");
            }
      }
    }
  }