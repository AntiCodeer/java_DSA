 import java.util.Scanner;
class Q24_factorialShaow{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("\nEnter an Integer :- ");
		int n = in.nextInt();

		fact_itt(n);
		System.out.println();
		in.close();
	}

	static void fact_itt(int n){
		if(n==0){
			System.out.printf("%d! = %d",n,n);
		}
		else if (n==1) {
			System.out.printf("%d! = %d",n,n);
		}
		else
		{
			int fact=1;
			System.out.printf("%d! = 1",n);
			for (int i=2; i<=n; ++i) {
				fact = fact * i;
				System.out.printf(" * %d ",i);
			}
			System.out.printf("= %d",fact);
		}
	}
}