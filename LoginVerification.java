import java.util.Scanner;
public class LoginVerification {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String username , password;
        username = Sc.next();
        password = Sc.next();
        if(username.equals("User123")&&password.equals("54321"))
        {
            System.out.println("Welcome");
        }
        else{
            System.out.println("Sorry try again");
        }
    }
}
