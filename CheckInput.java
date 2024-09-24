import java.util.Scanner;
class CheckInput
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n= S.nextInt();
        if(n==0)
        {
            System.out.println("Welcome");
        }
    }
}