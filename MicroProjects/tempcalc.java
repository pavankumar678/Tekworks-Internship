import java.util.*;
class Temp
  {
    public static void main(String arg[])
    {
      double temp;
      String="celsius";
      String= "fahrenheit";
      System.out.println("Enter temp");
      System.out.println("ur temp type?");
      Scanner f=new Scanner(System.in);
      temp=f.nextDouble();
      Temperature s=new Temperature();
      switch(temp)
        {
          case "celsius":
          Double Fresult=s.celtofar(temp);
          System.out.println(Fresult);
            break;
          case "fahrenheit":
          double Cresult=s.fartocel(temp);
          System.out.println(Cresult);
            break;
          default:
          System.out.println("enter valid temp");
            break;
        }
    }
      double  celtofar(double temp)
        {    
        return (temp * 9 / 5) + 32;
          }
      double  fartocel(double temp)
      {
      return (temp-32)*5/9;
      }
  }
      

  