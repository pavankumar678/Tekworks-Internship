/*Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.*/
import java.util.*;
class Shape
  {
    String color;
    Shape()
    {
      
    }
    Shape(String color)
    {
      this.color=color;
      System.out.println("Your shape color is"+color);
    }
   
  }
 class Rectangle extends Shape
   {
     int length,breadth;
     Rectangle(int length,int breadth)
     {
       this.length=length;
       this.breadth=breadth;
     }
     void calculatearea()
     {
       int area=(length*breadth);
       System.out.println("Area of rectangle  "+"of"+color+" colour is"+area);
     }
   }
 class Triangle extends Shape
 {
   int breadth1,height;
   Triangle(int breadth1,int height)
   {
     this.breadth1=breadth1;
     this.heigth=height;
   }
   void calculatearea()
   {
     double area=(0.5*breadth*height);
     System.out.println("area of triangle of"+color+"colour is"+area);
   }
 }
class Circle extends Shape
  {
    int radius;
    Circle(int radius)
    {
      this.radius=radius;
    }
    void calculatearea()
    {
      double area=(3.14*radius*radius);
      System.out.println("area of circle fo "+color+"colour is"+area);
    }
  }
class Shapetester
  {
    public static void main(String[] a)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter shape color");
      String c=sc.nextInt();
      Shape s=new Shape(c);
      s.calculatearea();
      System.out.println("enter length and breadth of rectangle");
      int len=sc.nextInt();
      int breadth=sc.nextInt();
      Rectangle r=new Rectangle(len,breadth);
      r.calculatearea();
      System.out.println("enter breath and height of triangle");
      int bre=sc.nextInt();
      int h=sc.nextInt();
      Triangle t=new Triangle(bre,h);
      t.calculatearea();
      System.out.println("enter circle radius");
      int rad=sc.nextInt();
      Circle f=new Circle(rad);
      f.calculatearea();
    }
  }