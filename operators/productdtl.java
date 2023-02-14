import java.util.Scanner;
class product
{
   public static void main(String arg[])
        {
          String product_name;
          double MRP,selling_price;
Scanner p=new Scanner(System.in); 
        System.out.println("enter product details");         
        product_name=p.next();
        MRP=p.nextDouble();
        selling_price=MRP-(MRP*0.1);//ten% discount on MRP
        System.out.println("selling_price is"+selling_price);
        }
}
       