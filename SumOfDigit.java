import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter three digit number");
        Scanner Bobby = new Scanner(System.in);
        int num = Bobby.nextInt();
        int sum = 0;
        sum+=num%10;
        num/=10;
        sum+=num%10;
        num/=10;
        sum+=num;
        System.out.println("Sum="+sum);
        Bobby.close();
    }
    
}
