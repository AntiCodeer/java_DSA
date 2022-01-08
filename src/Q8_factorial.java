package src;

import java.util.Scanner;

class Q8_factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("\nEnter Your Number :- ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; ++i) {
            if(n % i == 0) {
                ++count;
                System.out.printf("\n%d is a Facotor of %d", i, n);
            }
        }
        System.out.printf("\n%d has Total %d No of Facotors",n, count);
        sc.close();
        System.out.println();
    }
}
