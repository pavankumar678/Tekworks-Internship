import java.util.*;
class IncaliddishException extends Exception
  {
    public InvaliddishException(String message)
    {
      super(message);
    }
  }
class Dish
    {
    String dish_name;
    int price;
      int num;
      String[] d;
    void getName()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the dish name:");
    try{
      dish_name=s.next();
      }
      catch(InputMismatchException im)
      {
        System.out.println("dish name must be in alphabets ");
      }
      //System.out.println("dish name is:"+dish_name);
    }
    void getIngredients()
    {
       Scanner s=new Scanner(System.in);
      System.out.println("enter the number of ingredients:");
      int ing=s.nextInt();
      String ingredients[]=new String[ing];
      System.out.println("enter the ingredients:");
      for(int i=0;i<=ingredients.length-1;i++)
        {
          ingredients[i]=s.next();
          
        }
    
    }
void addDish()
  {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the number of dishes:");
  num=s.nextInt();
  d=new String[num];
  for(int i=0;i<num;i++)
    {
      d[i]=s.nextLine();
    }
  for(int i=0;i<num;i++)
    {if(d[i]==dish_name){
  try{
    throw new InvaliddishException("dish is already exists");
  }
      catch(InvaliddishException de)
    {
      System.out.println(de);
    }
    }
      else
    {
      System.out.println("dish is added");
    }
    }
  }
  
      void removeDish()
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the  dish to be removed:");
        String dish_name=s.next();
        for(int i=0;i<=d.length-1;i++)
          {
            if(d[i]!=dish_name)
            {
              try{
        throw new InvaliddishException("dish is already removed");
              }
            catch(InvaliddishException df)
              {
              System.out.println(df);
              }
            }
            else{
              System.out.println("dish is removed");
            }

              }
          }
      
    void getPrice()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the price:");
    
      try{
      price=s.nextInt();
      }
      catch(InputMismatchException id)
        {
        System.out.println("enter the valid price:");
        }
    
    }
      
      
  }
  
class Restaurant
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the number of dishes:");
      int number_of_dishes=s.nextInt();
    Dish d[]=new Dish[number_of_dishes];
      for(int i=0;i<=number_of_dishes-1;i++)
        {
          d[i]=new Dish();
         d[i].getName();
        d[i].getIngredients();
        d[i].addDish();
          d[i].removeDish();
        d[i].getPrice();
        }
  }
  }