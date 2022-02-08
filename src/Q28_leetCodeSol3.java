 import java.util.*;
class Q28_leetCodeSol3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [4];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();			
		}
		getConcatenation(nums);
		sc.close();
		System.out.println();
	}
	static void getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];

        for (int i=0; i<n; ++i) {
        	ans[i] = nums[i];
        	ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}