import java.util.*;
class HalfOfNumber
{
public static void main(String [] args)
{
System.out.println("Enter a number");
Scanner Sc = new Scanner (System.in);
int num = Sc.nextInt();
int half = num/2;
System.out.println("Half of" + num + "is" + half);
Sc.close();
}
}
