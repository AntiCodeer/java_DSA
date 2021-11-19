import java.util.Scanner;
class Q12_avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0,n,sum=0;
		System.out.println("\nEnter No = 0 To Exit ....");
		do
		{
			System.out.print("\nEnter No :- ");
			n = sc.nextInt();
			sum = sum + n;
			++c;
		}while(n>0);
		float avg = sum / c+1;
		System.out.println(avg);
		System.out.println(sum);
		sc.close();
		System.out.println();
	}
}