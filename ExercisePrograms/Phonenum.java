import java.util.*;
class phone_no
{
public static void main(String[] arg)
{
long phone_no;
System.out.println("enter your phone number");
Scanner o=new Scanner(System.in);
phone_no=o.nextLong();
int count=0;
while(count<=10)
{
 int i=phone_no%10;
phone_no=phone_no/10;
count=count+1;
}
if(count==10)
{
System.out.println("ur phonenumber is valid");
}
else
{
Syste.out.println("ur phonenumber is invalid");
}
}
}