import java.util.Scanner;

class Q9_sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        do {
            System.out.println("Enter Number :- ");
            n = sc.nextInt();
            sum = sum + n;
        }while(n != 0);
        System.out.println("Sum = "+sum);
    }
} 
