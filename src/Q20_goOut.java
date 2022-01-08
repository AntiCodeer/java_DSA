package src;

import java.util.Scanner;
class Q20_goOut{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("\nEnter The No of Days In The Queried Month :- ");
		int d = sc.nextInt();
		int c = 0;
		for (int i=1; i<=d; ++i) {
			if(i%2==0) {
				// System.out.printf("\n%d is a Even Day of This Month.",i);
				++c;
			}
		}
		System.out.printf("He Can Go Out Only %d Days In this Month.",c);
		sc.close();
		System.out.println();
	}
}