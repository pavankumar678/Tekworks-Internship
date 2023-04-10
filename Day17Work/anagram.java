import java.util.*;
class anagram
  {
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("Enter string1 data");
      str=sc.nextLine();
      System.out.println("enter string2 data");
      String str1=new String(sc.nextLine());
      str=str.toLowerCase();
      str1=str1.toLowerCase();
      checkanagram(str,str1);
          }
     static void checkanagram(String s,String s1)
    {
      if(s.length()==s1.length())
      {
        char c1[]=s.toCharArray();
        char t='\n';
        char m=c1[0];       
        for(int i=0;i<c1.length;i++)
          {
            m=t;
            c1[i]=m;
            t=c1[i];
          }
        System.out.println(c1);
          char c2[]=s1.toCharArray();
          char p='\n';
          char n=c2[0];
         for(int j=0;j<c2.length;j++)
           {
             n=p;
             c2[i]=n;
             p=c2[i];
           }
       System.out.println(c2);
                  
      }
      else{
        System.out.println(s+"&"+s1+"are not Anagrams");
      }
      int d=-1;
      for(int k=0;k<c1.length-1;k++)
        {
         if(c1[k]!=c2[k])
         {
           d=0;
           break;
         }
          else{
            continue;
          }
        }
      if(d==0)
      {
        System.out.println("both strings aren't Anagrams");
      }
      else{
        System.out.println("Given Strings are Anagrams");
      }
    }
  }