import java.util.Scanner;
import java.util.Arrays;
class Q36_leetCodeSol11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		int index[] = new int[5];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		for (int i=0; i<index.length; ++i) {
			index[i] = sc.nextInt();
		}
		createTargetArray(nums,index);
		sc.close();
		System.out.println();
	}

	static void createTargetArray(int[] nums, int[] index) {
        int target[] = new int[index.length];
        for (int i=0; i<index.length; ++i) {
        	for (int j=index.length-1; j>index[i]; --j) {
        		target[j] = target[j-1];        		
        	}
        	target[index[i]] = nums[i];        	
        }
        System.out.println(Arrays.toString(target));
        // return target;	//for leetcode
    }
}
