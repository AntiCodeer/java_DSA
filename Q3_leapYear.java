import java.util.Scanner;
<<<<<<< HEAD
public class Q3_leapYear 

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

        System.out.print("\n");
    }
}
=======

class Q3_leapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if (year % 400 == 0) {
            System.out.printf("\n%d is a Leap Year",year);
        }
        else if (year % 100 == 0) {
            System.out.printf("\n%d is a Leap Year",year);
        }
        else if (year % 4 == 0) {
            System.out.printf("\n%d is a Leap Year",year);            
        }
        else{
            System.out.printf("\n%d is Not a Leap Year",year);                        
        }
    }
}
>>>>>>> 574eba981e89e9d30823089c29b79b3e557e6110
