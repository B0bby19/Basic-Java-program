import java.util.Scanner;
public class CheckPalindrome {
   public static void main(String[] args) {
    int n,r=0,digit,backup;
    Scanner S= new Scanner(System.in);
    n = S.nextInt();
    backup =n;
    while(n>0)
    {
        digit =n%10;
        r=r*10+digit;
        n=n/10;
    } 
    if(r==backup)
    {
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("Number is not palindrome");
    }
   } 
}
