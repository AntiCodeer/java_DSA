import java.util.Scanner;

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