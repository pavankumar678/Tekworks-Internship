import java.util.*;
class pavan
{
public static void main(String[] arg)
{
int N,M,stop_no;
System.out.println("Enter maximum value:");
Scanner p=new Scanner(System.in);
N=p.nextInt();
System.out.println("enter minimum value");
M=p.nextInt();
System.out.println("Enter any stopnumber");
stop_no=p.nextInt();
while(N>=M)
{
if(N%2==0 && N%3==0)
{
if(N==stop_no)
{
break;
}
else
{
System.out.println(N);
}
}
N--;
}
}
}