//Find maximum length and minimum length words in given string
import java.util.*;
class wordlength
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter String data");
      String str=new String(sc.nextLine());
      String arr[]=string.split(" ");
      for(int i=0;i<arr.length;i++)
        {
      System.out.println(arr[i]);
        }
     String small="",large="";
      small=large=arr[0];
      for(int k=0;k<arr.length;k++)
        {
          //If length of small is greater than any word present in the string    
          //Store value of word into small 
          if(small.length>arr[k].length())
            small=arr[k];
           //If length of large is less than any word present in the string    
          //Store value of word into large    
          if(large.length<arr[k].length())
            large=arr[k];
        }
       System.out.println("Smallest word: " + small);    
      System.out.println("Largest word: " + large);    
    }
  }