import java.util.Scanner;
public class CheckArmstrong {
public static void main(String[] args) {
    int n,temp=0,digit,backup;
    Scanner S= new Scanner(System.in);
    n= S.nextInt();
    backup = n;
    while(n>0)
    {
        digit=n%10;
        temp=temp+(digit*digit*digit);
        n=n/10;
    }
    if(backup==temp)
    {
        System.out.println("Number is Armstrong");
    }
    else{
        System.out.println("Number is not Armstrong");
    }
}

}
