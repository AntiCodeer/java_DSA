import java.util.*;
class Q32_leetCodeSol7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [5];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		solve(nums,3);
		sc.close();
		System.out.println();
	}

	static void solve(int[] candies,int extraCandies) {
		ArrayList<Boolean> a = new ArrayList<Boolean>();
		for(int i=0; i<candies.length; ++i) {
			boolean t = false;
			for (int j=0; j<candies.length; ++j) {
				if (candies[i]+extraCandies < candies[j]) {
					t = true;
					break;
				}
			}
			if (t) {
				a.add(false);				
			}
			else {
				a.add(true);
			}
		}
		System.out.println(a);
	}
}
