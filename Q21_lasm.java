import java.util.Scanner;
class Q21_lasm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter A = ");
		int a = in.nextInt();
		System.out.printf("\nEnter B = ");
		int b = in.nextInt();
		System.out.printf("\nEnter C = ");
		int c = in.nextInt();

		System.out.printf("\nBetween %d, %d and %d, The Largest = %d",a,b,c,lar(a,b,c));
		System.out.printf("\nBetween %d, %d and %d, The Smallest = %d",a,b,c,sma(a,b,c));
		System.out.println();
	}

	static int lar(int a,int b,int c) {
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	static int sma(int a,int b,int c) {
		if(a<b && a<c)
			return a;
		else if(b<a && b<c)
			return b;
		else
			return c;
	}
}