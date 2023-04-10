//Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.
import java.util.*;
class Product
  {
    String name;
    Double price;
    int quantity;
    void getName()
      {
      Scanner s=new Scanner(System.in);
        System.out.println("enter Product u want");
        name=s.nextLine();
        System.out.println("Prouduct:"+name);
      }
    void getPrice()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter price of that product");
      price=sc.nextDouble();
      System.out.println("Cost of"+name+"is"+price);
      
    }
    void getQuantity()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter quantity u required");
      quantity=sc.nextInt();
      System.out.println("Quantity of"+name+"is"+quantity);
    }
    
  }
class Salesystem
  {
    public static void main(String[] a)
    {
      Product p=new Product();
      p.getName();
      p.getPrice();
      p.getQuantity();
    }
  }