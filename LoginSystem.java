import java.util.Scanner;
public class LoginSystem {
   public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
String user,password;
user = Sc.next();
if(user.equals("User123"))
{
    password = Sc.next();
    if(password.equals("54321"))
    {
        System.out.println("Success!");
    }
    else
    {
        System.out.println("Incorret Password");
    }
}
    else
    {
        System.out.println("Invalid username");
    }

   } 
}
