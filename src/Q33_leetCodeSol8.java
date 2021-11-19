import java.util.*;
class Q33_leetCodeSol8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [4];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		numIdenticalPairs(nums);
		sc.close();
		System.out.println();
	}
	static void numIdenticalPairs(int[] nums) {
		int c=0;
		for (int i=0; i<nums.length; ++i) {
			for (int j=0; j<nums.length; ++j) {
				if (nums[i] == nums[j] && i<j) {
					++c;
				}				
			}
		}
		System.out.println(c);
		// return c;
    }
}