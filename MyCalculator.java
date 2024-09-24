import java.util.Scanner;
public class MyCalculator{
public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int maths, english, digital, fundamental, society;
    maths = 60;
    english =45;
    digital = 90;
    fundamental =80;
    society =60;
    int percentage = (maths+english+digital+fundamental+society)/5;
    if(percentage>=80 && percentage<100)
    {
        System.out.print("A");
    }
    else if(percentage>=60)
    {
        System.out.print("B");
    }
    else if(percentage>=40)
    {
        System.out.print("C");
    }
    else if(percentage>=0)
    {
        System.out.print("Failed");
    }
    else
    {
        System.out.print("Sorry try again");

    }
}
}

