import java.util.*;

public class CalculateTime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = Sc.nextInt();
        int S = seconds % 60;  
        int H = seconds / 60;  
        int M = H % 60;         
        H = H / 60;   
        System.out.println(+H+"Hours:" +M+"minutes:" +S+ "seconds"); 
        Sc.close();
    }
}
