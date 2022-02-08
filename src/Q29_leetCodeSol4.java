 import java.util.*;
class Q29_leetCodeSol3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [5];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();			
		}
		runningSum(nums);
		sc.close();
		System.out.println();
	}
	static void runningSum(int[] nums) {
        
        for (int i=1; i<nums.length; ++i) {
			nums[i] = nums[i]+nums[i-1];     	
        }
        System.out.println(Arrays.toString(nums));
    }
}