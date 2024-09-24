import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String [] args)
    {
        Scanner bobby = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = bobby.nextDouble();
        System.out.println("Area"+(3.14*radius*radius));
        bobby.close();
    
    }
}