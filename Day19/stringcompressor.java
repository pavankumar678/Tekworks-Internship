import java.util.*;
class stringcompressor
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      String s=new String();
      System.out.println("enter string data only in combination of a,b,c");
      s=sc.next();
      compress(s);
      
    }
    static void compress(String s1)
    {
      int i,j;
      char arr[]=s1.toCharArray();
        int[] freq = new int[s1.length()]; 
         for(i = 0; i <s1.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <s1.length(); j++) {  
                if(arr[i] == arr[j]) {  
                    freq[i]++;  
                  arr[j] = '0'; 
                }
            }
         }
      for(i = 0; i <freq.length; i++) {  
            if(arr[i] != ' ' && arr[i] != '0')  
                System.out.println(arr[i] + "-" + freq[i]);
              char arr1[]=new char[6];
        for(int k=0;k<arr1.length;k=k+2)
          {
            arr1[k]=arr[i];
            arr1[k+1]=freq[i];
          }
       
             }
      System.out.println(arr1);
  }
  }
    