import java.util.Scanner;

public class Q1_LargeNo
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter A :- ");
        int a = sc.nextInt();
        System.out.print("\nEnter B :- ");
        int b = sc.nextInt();
        System.out.print("\nEnter C :- ");
        int c = sc.nextInt();

        System.out.printf("\nYou Entered A = %d, B = %d, C = %d",a,b,c);
        if (a>b && a>c)
        {
            System.out.printf("\nA = %d is the Largest No",a);    
        }
        else if (b>a && b>c)
        {
            System.out.printf("\nB = %d is the Largest No",b);    
        }
        else
        {
            System.out.printf("\nC = %d is the Largest No",c);    
        }

        System.out.println();
    }   
}
