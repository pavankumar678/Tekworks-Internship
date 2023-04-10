import java.util.*;
class Tabletennis
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      String s1=new String();
      System.out.println("Enter BinaryPoints  Peter gain");
      System.out.println("Enter 0:if he lose point");
       System.out.println("Enter 1:if he won point");
      s1=s.nextLine();
      Pointcount(s1);
    }
    static void Pointcount(String p)
    {
      int count_0=0;
      int count_1=0;
      for(int i=0;i<p.length;i++)
        {
          if(p.charAt(i)=='0')
          {
            count_0=count_0+1;
          }
          else{
            count_1=count_1+1;
          }
        }
      System.out.println("total won points:"+count_1);
      System.out.println("total loose points:"+count_0);
      if(count_1==11 && count_0<count_1)
      {
       System.out.println("win");
      }
      else{
        System.out.println("loss");
      }
      
    }
  }