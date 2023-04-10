//Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException to throw when a product is not found in the store
import java.util.*;
class InvalidPriceException extends Exception
  {
    InvalidPriceException(String message)
    {
      super(message);
    }
  }
class Product
  {
    String product_name;
    int price;
    int quantity;
    void getName()
    {
      Scanner s=new Scanner(System.in);
    System.out.println("enter the product name:");
      try{
      product_name=s.next();
      }
      catch(InputMismatchException e)
        {
          System.out.println("product name should be in alphabets");
          getName();
        }
    }
    void getPrice()
    {
       Scanner s=new Scanner(System.in);
    System.out.println("enter the product price:");
      price=s.nextInt();
      if(price<0)
      {
      try{
      throw new InvalidPriceException("price must be greater than zero");
         }
      catch(InvalidPriceException i)
        {
         System.out.println(i);
        }
      }
      else{
        System.out.println("product price is :"+price);
      }
     }
    void getQuantity()
    {
       Scanner s=new Scanner(System.in);
     System.out.println("enter the Quantity:"); 
      try{
      quantity=s.nextInt();
      }
      catch(InputMismatchException f)
        {
         System.out.println("quantity must be in integers");
          getQuantity();
        }
    }
    void display()
    {
      System.out.println("product name is:"+product_name);
      System.out.println("product price is:"+price);
      System.out.println("product price is:"+quantity);

    }
  }
class PointofSaleSystem
  {
    public static void main(String[] ar)
    {
      System.out.println("enter the number of products:");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
  Product prod[]=new Product[n];
    for(int i=0;i<n;i++)
      {
        prod[i]=new Product();
        prod[i].getName();
    prod[i].getPrice();
    prod[i].getQuantity();
        prod[i].display();
    }
  }
  }