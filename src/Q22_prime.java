import java.util.Scanner;
class Q22_prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a Number :- ");
		int n = in.nextInt();

		if (isPrime(n)) {
			System.out.printf("\n%d is a Prime No",n);
		}
		else
			System.out.printf("\n%d is Not a Prime No",n);
		System.out.println();
		in.close();
	}

	static boolean isPrime(int n){
		int i;
		for (i=2; i<=n/2; ++i) {
			if (n%i==0) {
				break;
			}
		}
		if (i>n/2) {
			return true;
		}
		else
			return false;
	}
}