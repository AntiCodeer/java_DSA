import java.util.Scanner;

class Q23_palNo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEneter a No :- ");
		int a = in.nextInt();

		if (isPalindrome(a)) {
			System.out.printf("\n%d is a Palindrome No.",a);
		}
		else
			System.out.printf("\n%d is Not a Palindrome No.",a);
		System.out.println();
		in.close();
	}

	static boolean isPalindrome(int n){
		int rev=0,rem,c=n;
		while(c!=0){
			rem = c % 10;
			rev = (rev*10) + rem;
			c = c/10;
		}

		if(rev==n){
			return true;
		}
		else
			return false;
	}
}