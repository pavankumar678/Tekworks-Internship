class function
{
 public static void main(String[] a)
  {
   int x=2;
   int y=9;
   System.out.println("addition of x&y:");
    int r=addition(x,y);
   System.out.println(r);
  System.out.println("subtraction of x&Y:");
   int s=subtraction();
 System.out.println(s);
 System.out.println("multiplication of x&Y:");
 multiplication(x,y);
 System.out.println("Divison of x&Y:");
 Divison();
  }
 static  int addition(int a,int b)
{
 return (a+b);
}
static int subtraction()
{
 int x=2,y=9;
 return(x-y);
}
  static void multiplication(int a1,int b1)
{
 int p=(a1*b1);
 System.out.println(p);
}
  static void Divison()
{
  double x=2.0;
  double y=9.0;
  double w=(x/y);
 System.out.println(w);
}
}
