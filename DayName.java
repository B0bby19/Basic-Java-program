import java.util.Scanner;
public class DayName {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int dayname = S.nextInt();
        if(dayname==1)
        {
            System.out.print("Sunday");
        }
        else if(dayname==2)
        {
            System.out.print("Monday");
        }
        else if(dayname==3)
        {
            System.out.print("Tuesday");
        }
        else if(dayname==4)
        {
            System.out.print("Wednesday");
        }
        else if(dayname==5)
        {
            System.out.print("Thursady");
        }
        else if(dayname==6)
        {
            System.out.print("Friday");
        }
        else if(dayname==7)
        {
            System.out.print("Saturday");
        }
else
{
    System.out.print("Wrong Input");
}

    }
    
}
