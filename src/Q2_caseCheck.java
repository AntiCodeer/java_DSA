package src;

import java.util.Scanner;

public class Q2_caseCheck
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a Cheracter :- ");
        char c = sc.next().trim().charAt(0);

        if(c >= 'a' && c <= 'z')
        {
            System.out.printf("\n %c is a Lowercase Character.",c);
        }
        else
        {
            System.out.printf("\n %c is a Uppercase Character.",c);
        }
        sc.close();
        System.out.println();
    }
}
