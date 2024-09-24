import java.util.*;
public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Enter three digit number");
        Scanner Bobby=new Scanner(System.in);
        int num = Bobby.nextInt();
        int rev = 0;
        rev= rev*10+num%10;
        num/=10;
        rev = rev*10+num%10;
        num/=10;
        rev= rev* 10+num;
        System.out.println("Reverse="+rev);
        Bobby.close();
    }
}
