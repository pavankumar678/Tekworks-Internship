
//String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.
import java.util.*;
class ReplaceString
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String str1=new String();
      System.out.println("Enter string1 data");
      str1=sc.nextLine();
      String q=replacestring(str1);
      System.out.println("Replaced string:"+q);
    }
    static String replacestring(String str)
    {
      String word1=new String();
      Scanner sx=new Scanner(System.in);
      System.out.println("enter word u want to replace");
      word=sx.next();
      String word2=new String();
      System.out.println("enter word u want to replace with");
      word2=sx.next();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)!=" ")
          {
            if(str.charAt(i)==word1)
            {
              String p=str.replace(word1,word2);
            }
            else{
              System.out.println(word1+"can't find in given string");
            }
          }
        }
      return p;
      
      
    }
  }