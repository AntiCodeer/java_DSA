package src;

import java.util.Scanner;

class Q4_fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the No of Terms You Want To Print :- ");
        int n = sc.nextInt();
        sc.close();
        fib_itt(n);
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.printf("\nFib_Rec [%d] = %d", i,fib_rec(i));
        }
        System.out.println();
    }

    static void fib_itt(int n) {
        int fib[] = new int [100];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("\nFib [0] = 0");
        System.out.print("\nFib [1] = 1");
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.printf("\nFib [%d] = %d",i,fib[i]);
        }
    }

    static int fib_rec(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib_rec(n-1)+fib_rec(n-2);
        }
    }
}
