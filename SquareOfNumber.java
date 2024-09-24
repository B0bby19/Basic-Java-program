import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        
            System.out.println("Enter a number");
            Scanner Sc = new Scanner(System.in);
            int num= Sc.nextInt();
            int Square= num*num;
            System.out.println("Square of"+num+"is"+ Square);
            Sc.close();
        }
    }

