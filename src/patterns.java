import java.util.Scanner;
class patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// System.out.print("\nEnter the no of rows :");
		int n = sc.nextInt();
		pyramidal(n);
		System.out.println();
		revPyramidal(n);
		System.out.println();
		normPyramid(n);
		System.out.println();
		revNormPyramid(n);
		System.out.println();
		floyd(n);
		System.out.println();
		revFloyd(n);
		System.out.println();
		sc.close();
	}
	static void pyramidal(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	static void revPyramidal(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = i; j <= n; ++j) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	static void normPyramid(int n) {
		int m = n;
		for (int i = n; i >= 1; --i) {
			for (int j = 1; j <= m; ++j) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; ++k) {
				System.out.print(" *");
			}
			--m;
			System.out.println();
		}
	}
	static void revNormPyramid(int n) {
		int m = n;
		for (int i = n; i >= 1; --i) {
			for (int j = i; j <= n; ++j) {
				System.out.print(" ");
			}
			for (int k = 1; k <= m; ++k) {
				System.out.print(" *");
			}
			System.out.println();
			--m;
		}
	}
	static void floyd(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.printf(" %d", j);
			}
			System.out.println();
		}
	}
	static void revFloyd(int n) {
		for (int i = 1; i <= n; ++i) {
			for (int j = i; j <= n; ++j) {
				System.out.printf(" %d", j);
			}
			System.out.println();
		}
	}
	static void Letters(int n) {
		for (int i = 1; i <= n; ++i) {
			
		}
	}
}