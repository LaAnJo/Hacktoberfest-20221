 import java.util.*;
public class Armstrong{
    public static void main(String  args[])
{

//to check if the number is armstrong
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int m=n;Sc.close();int sum=0;
while(m!=0)
{
int rem=m%10;
sum=sum+rem*rem*rem;
m=m/10;
}
if(sum==n)
System.out.println("Armstrong Number");
else
System.out.println(" Not Armstrong Number");




}
}
