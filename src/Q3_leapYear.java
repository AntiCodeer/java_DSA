package src;

import java.util.Scanner;

class Q3_leapYear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter The Year :- ");
        int year = sc.nextInt();

        if (year % 4 == 0) 
        {
            if (year % 100 == 0)
            {                
                if (year % 400 == 0) 
                {
                    System.out.printf("%d Is A Leap Year.",year);
                }            
                else
                {
                    System.out.printf("%d Is Not A Leap Year.",year);
                }
            }
            else
            {
                System.out.printf("%d Is A Leap Year.",year);
            }
        }
        else
        {
            System.out.printf("%d Is Not A Leap Year.",year);
        }
        sc.close();
        System.out.print("\n");
    }
}

