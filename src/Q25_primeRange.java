import java.util.Scanner;
class Q25_primeRange {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter The Range of Prime No With A and B.....");
		System.out.printf("\nEnter A -> ");
		int a = in.nextInt();
		System.out.printf("\nEnter B -> ");
		int b = in.nextInt();
		for (int i=a; i<=b; ++i) {
			prime(i);
		}
		in.close();
		System.out.println();
	}

	static void prime(int n) {
		int i;
		for(i=2; i<=n/2; ++i) {
			if (n%i==0) {
				break;
			}
		}
		if (i>n/2) {
			System.out.printf("\n%d is a Prime No.",n);
		}
	}
}