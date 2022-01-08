package src;

import java.util.Scanner;
class Q26_sumNatural {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter How Many No You Want :- ");
		int n = in.nextInt();

		sum(n);
		in.close();
		System.out.println();
	}

	static void sum(int n) {
		int sum=0;

		sum = (n * (n+1))/2;
		System.out.printf("\nSum = %d",sum);
	}
}