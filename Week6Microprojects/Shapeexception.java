//Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.
import java.util.*;
class Shape
  {
    int radius;
    int length,breadth;
    int base,height,side;
  }
class Circle extends Shape
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius of circle");
    radius=sc.nextInt();
    void area() throws Exception
      {
        if(radius<0)
      throw new Exception("Invalid Dimension Exception");
        else
       System.out.println("Area of circle is"+(3.14*radius*radius));
      }
    void perimeter() throws Exception
      {
      if(radius<0)
      throw new Exception("Invalid Dimension Exception");
        else
       System.out.println("Perimeter of circle is"+(2*3.14*radius));
      }
   }
class Rectangle extends Shape
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length and breadth of Rectangle");
    length=sc.nextInt();
    breadth=sc.nextInt();
      void area() throws Exception
        {
        if(breadth>length)
        throw new Exception("Invalid Dimension Exception");
        else
        System.out.println("Area:"+(length*breadth));
        }
      void perimeter() throws Exception
        {
        if(breadth>length)
        throw new Exception("Invalid Dimension Exception");
        else
        System.out.println("Perimeter:"+2*(length+breadth));
        }

  }
class Triangle extends Shape
  {
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter Base,height and side of Triangle");
    base=sc.nextInt();
    height=sc.nextInt();
    side=sc.nextInt();
     void area() throws Exception
       {
        if(side==0)
          throw new Exception("Invalid Dimension");
        else
       System.out.println("area:"+((base*height)/2))
       }
      void perimeter() throws Exception
       {
       if(side==0)
          throw new Exception("Invalid Dimension");
        else
       System.out.println("Perimeter:"+((base+side+side));
       }
  }
class Mainshape
  {
    public static void main(String a[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Choose shape!");
      System.out.println("1.Circle");
      System.out.println("2.Rectangle");
      System.out.println("3.Triangle");
      int i=sc.nextInt();
      switch(i)
           {
             case 1:
               Circle c= new Circle();
               c.area();
               c.perimeter();
               break;
             case 2:
               Rectangle r= new Rectangle();
               r.area();
               r.perimeter();
               break;
             case 3:
               Triangle t=new Triangle();
               t.area();
               t.perimeter();
               break;
           }
      
    }
  }