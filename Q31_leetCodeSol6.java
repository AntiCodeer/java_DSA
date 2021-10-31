import java.util.*;
class Q31_leetCodeSol6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[6];
		for(int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		shuffleArray(nums,3);
		shuffleArray1(nums,3);
		sc.close();
		System.out.println();
	}
	
	static void shuffleArray(int nums[],int n) {
		// First let's try brute force Algorithms
		int ans[] = new int[2*n];
		int j=0;
		for (int i=0; i<2*n; i=i+2) {
			ans[i] = nums[j];
			ans[i+1] = nums[j+n];
			++j;			
		}
		System.out.print("\nShuffle By Brute Force -> ");
		System.out.print(Arrays.toString(ans));
		System.out.println();
	}

	static void shuffleArray1(int[] nums,int n) {
		//lets try to optimize a bit
		for (int i=0; i<n; ++i) {
			nums[i+n] += nums[i]*1000;
		}
		for (int i=0; i<n; ++i) {
			nums[2*i] = nums[i+n] / 1000;
			nums[2*i+1] = nums[i+n] % 1000;			
		}
		System.out.print("\nEfficent Approach -> ");
		System.out.print(Arrays.toString(nums));
	}
}