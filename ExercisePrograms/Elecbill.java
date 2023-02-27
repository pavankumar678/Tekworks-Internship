import java.util.*;
class electricitybill
{
public static void main(String arg[])
{
int amount,units;
System.out.println("Enter no.of units units u charged");
Scanner p=new Scanner(System.in);
units=p.nextInt();
if(units<=50)
{
amount=(units*0.50);
System.out.println("Your electricityBill amount:"+amount);
}
else if(units>50 && units<=150)
{
amount=(units*0.75);
System.out.println("Your electricityBill amount:"+amount);
}
else if(units>150 && units<=250)
{
amount=(units*1.20);
System.out.println("Your electricityBill amount:"+amount);
}
else if(units>250)
{
amount=(units*1.50);
System.out.println("Your electricityBill amount:"+amount);
}
else
{
System.out.println("enter valid electricity units");
}
}
}