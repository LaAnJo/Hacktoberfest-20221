import java.util.*;

class Node {
    public int data;
    public Node Next;

    public Node(int p) {
        data = p;
        Next = null;
    }
}

public class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Node First,Current;
       First=Current=null;

       ab: while(true)
       {
           int n=sc.nextInt();
           switch(n)
           {
               case 0:
               break ab;
               default:
               int c=0;
               for(int a=1;a<n;a++)
               {
                   cd: for(int b=a+1;b<=n;b++)
                   {
                       double hm=(double)(2*a*b)/(double)(a+b);
                       double checkint=hm-(int)(hm);
                       if(hm%2==0.0 && checkint==0.0)
                       {
                           int hhm=(int)(hm/2);
                           for(int i=2;i<=hhm;i++)
                           {
                               if(a%i==0 && b%i==0 && hhm%i==0)
                               continue cd;
                           }
                           c=c+1;
                       }   
                   }
               }
               if(First==null)
               First=Current=new Node(c);
               else
               {
                   Node newNode=new Node(c);
                   Current.Next=newNode;
                   Current=Current.Next;
               }
               break;
          }
      }

      while(First!=null)
      {
          System.out.println(First.data);
          First=First.Next;
      }
   }
}

{

}
