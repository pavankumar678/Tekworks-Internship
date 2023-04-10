 //Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines,;
import java.util.*;
class counting
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("Enter Text");
      str=sc.nextLine();
      int p=charactercount(str);
      System.out.println("Total characters in ur text:"+p);
     int q= wordcount(str);
      System.out.println("Total words in ur text:"+q);
     int r= spacecount(str);
      System.out.println("Total spaces in ur text"+r);
    }
    static int charactercount(String str1)
    {
      int char_count=0;
      for(int i=0;i<str1.length();i++)
        {
          if(str1.charAt(i)!=" ")
          {
            char_count=char_count+1;
          }
        }
      return char_count;
    }
    static int wordcount(String str2)
    {
      int word_count=0;
      String arr[]=str2.split(" ");
      for(int i=0;i<arr.length;i++)
        {
      word_count=word_count+1;
        }          
         return word_count;
    }
      static int spacecount(String str3)
        {
        int space_count=0;
       for(int k=0;k<str3.length();k++)
         {
           char ch=str3.charAt(k);
           if(ch==" ")
           {
             space_count=space_count+1;
           }
           else{
             return 0;
           }
         }
       return space_count;
        }
  }