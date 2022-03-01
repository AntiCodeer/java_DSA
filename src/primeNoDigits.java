import java.util.Scanner;

class primeNoDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter the range as A and B.....");
		System.out.print("\nEnter A :- ");
		int a = sc.nextInt();
		System.out.print("\nEnter B :- ");
		int b = sc.nextInt();
		for (int i = a; i <= b; ++i) {
			if (isPrime(i)) {
				if (isPrimeSum(i)) {
					System.out.printf("\n%d is a Prime No.",i);
				}
			}
			else {
				System.out.printf("\n%d is Not a Prime No.",i);
			}
		}
		sc.close();
		System.out.println();
	}

	static boolean isPrime(int n) {
		int i;
		for (i = 2; i <= n/2; ++i) {
			if (n % i == 0) {
				break;
			}
		}
		if (i > n/2) {
			return true;
		}
		return false;
	}
	static boolean isPrimeSum (int n) {
		int rem,sum=0;
		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		if (isPrime(sum)) {
			return true;
		}
		return false;
	}
}