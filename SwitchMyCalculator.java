import java.util.Scanner;
public class SwitchMyCalculator {
public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int maths, english, digital, fundamental, society;
    maths = 80;
    english =95;
    digital = 90;
    fundamental =80;
    society =70;
    int percentage = (maths+english+digital+fundamental+society)/5;
    switch(percentage/10)
    {
        case 1:
        case 2:
        case 3:System.out.print("Fail");break;
        case 4:
        case 5: System.out.print("C");break;
        case 6:
        case 7:System.out.print("B");break;
        case 8: 
        case 9: System.out.print("A");break;
        case 10: System.out.print("Sorry try again");break;
    }
    }
}
