import java.util.*;
class stringtokenizer
  {
    public static void main(String[] a)
    {
      String s="12 erre 475843 84";
StringTokenizer st=new StringTokenizer(s);
 
System.out.println(st.countTokens());  // 4
 
while(st.hasMoreTokens())
{
    System.out.println(st.nextToken());
    
}
    }
  }