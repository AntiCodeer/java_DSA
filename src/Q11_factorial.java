 import java.util.Scanner;
class Q11_factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :- ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=n; ++i) {
            fact = fact * i;
        }
        System.out.printf("Factorial [%d] = %d", n, fact);      //Itterative Approach

        System.out.printf("\n%d! = %d",n,fact_rec(n));
        sc.close();      //Recursive Approach
    }
    static int fact_rec(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        else {
            return n * fact_rec(n-1);
        }
    }
}
