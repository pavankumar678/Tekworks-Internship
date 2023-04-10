import java.util.*;
class wordcount
  {
    public static void main(String[] a)
    {
      Scanner s=new Scanner(System.in);
      String str=new String();
      System.out.println("enter string data");
      str=s.nextLine();
       int c=displaywordcount(str);
      System.out.println(c);
    }
    static int displaywordcount(String p)
    {
      int count=0;
      for(int i=0;i<p.length;i++)
        {
          if(p.charAt(i)!=" ")
          {
            count=count+1;
            while(p.charAt(i)!=" " && i<p.length()-1){
              i++;}
          }
        }
      return count;
    }
  }