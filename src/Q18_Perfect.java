package src;

import java.util.Scanner;
class Q18_Perfect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("\nEnter an Integer :- ");
		int n = sc.nextInt();
		int sum=0;
		for (int i=1; i<n; ++i) {
			if(n%i==0){
				System.out.printf("\n%d is a Divisor of %d",i,n);
				sum += i;
			}
		}
		System.out.println();
		if(sum == n) {
			System.out.printf("+\n-------------------------\n");
			System.out.printf("= %d is a Perfect No.",n);
		}
		else {
			System.out.printf("+\n-------------------------\n");
			System.out.printf("\n!= %d is Not a Perfect No.",n);
		}
		sc.close();
		System.out.println();
	}
}