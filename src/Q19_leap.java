 import java.util.Scanner;
class Q19_leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter a Year :- ");
		int year = sc.nextInt();

		if (((year%4==0) && (year%100!=0)) || (year%400==0)) {
			System.out.printf("\n%d is a Leap Year",year);
		}
		else {
			System.out.printf("\n%d is Not a Leap Year",year);
		}
		sc.close();
		System.out.println();
	}
}