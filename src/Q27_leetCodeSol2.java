import java.util.*;
class Q27_leetCodeSol2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nums[] = new int[6];	//size 6 because i know the test cases
		for(int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(nums));
		buildArray(nums);
		buildArray1(nums);
		sc.close();
		System.out.println();
	}

	static void buildArray(int nums[]) {
		int size = nums.length;
		int arr[] = new int[size];
		for (int i=1; i<size; ++i) {
			arr[i] = nums[nums[i]];
		}	//but on this method the spcae complexity is O(n)

		System.out.println(Arrays.toString(arr));
	}
	/*to reduce the space complexity we dont create another array....
	instead of creating another array we modify the actual array....*/

	static void buildArray1(int nums[]) {
		int size = nums.length;
		for (int i=0; i<size; ++i) {
			nums[i] = size * (nums[nums[i]] % size) + nums[i];
		}
		// now in nums[i] = [0, 8, 13, 29, 33, 22]
		for (int i=0; i<size; ++i) {
			nums[i] = nums[i]/size;			
		}
		//now in nums[i] = [0, 1, 2, 4, 5, 3]
		System.out.println(Arrays.toString(nums));
	}
}