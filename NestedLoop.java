import java.util.Scanner;
public class NestedLoop {
   public static void main(String[]args)
   {
    int i,j;
    for(i=0;i<=9;i++)
    {
        for(j=0;j<=2;j++)
        {
            System.out.print((i+1)*(j+2));
        }
        System.out.println();
    }
   } 
}
