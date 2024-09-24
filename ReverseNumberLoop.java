import java.util.Scanner;
public class ReverseNumberLoop 
{
    public static void main(String[]args)
{
    int n,r=0,digit;
    Scanner S= new Scanner(System.in);
n = S.nextInt();
while(n>0)
{
    digit=n%10;
    r=r*10+digit;
    n=n/10;
}
System.out.println("Reverse="+r);
}
}   

   

