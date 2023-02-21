import java.util.*;
class array
  {
    public static void main(String[] arg)
    {
      String statenames[]={"Andhrapradesh","Telangana","uttarpradesh","Rajasthan","goa","uttarakhand","kerala",} ;
      displaystatenames(statenames,7);
    }
    static void displaystatenames(String ps[],int n1)
    {
    for(String h:ps)
      System.out.println(h);
    }
  }