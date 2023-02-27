import java.util.*;
class mobile_no
{
 public static void main(String[] arg)
{
long mobile_no;
int count=0;
System.out.println("Enter your bestfriend mobileno.");
Scanner s=new Scanner(System.in);
mobile_no=s.nextLong();
if(mobile_no>0)
{
while(count<=4)
{
int i=(mobile_no%10);
mobile_no=mobile_no/10;
count=count+1;
System.out.println(i);
}
}
else
{
System.out.println("enter valid mobileno");
}
}
}