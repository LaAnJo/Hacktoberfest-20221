import java.util.*;
public class krishnamurti_number
{
    public static void main(String []args)
    {
        int n;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter a number to check if its krishnamurti or not");
        n=in.nextInt();
        int copy=n,i,p=1,s=0,d;
        while(copy>0)
        {
            d=copy%10;
            for(i=1;i<=d;i++)
            p=p*i;
            s+=p;
            p=1;
            copy=copy/10;
        }
        if(n==s)
        System.out.println("Krishnamurti number");
        else
        System.out.print("Not a krishnamurti Number");
    }
}