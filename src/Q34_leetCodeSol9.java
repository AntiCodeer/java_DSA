import java.util.*;

class Q34_leetCodeSol9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [4];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		smallerNumbersThanCurrent(nums);
		sc.close();
		System.out.println();
	}
	static void smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; ++i) {
        	int c=0;
        	for (int j=0; j<nums.length; ++j) {
        		if (nums[j]<nums[i] && j!=i) {
        			++c;	
        		} 		
				arr[i] = c;
        	}
    	}
    	System.out.println(Arrays.toString(arr));
    }
    
}