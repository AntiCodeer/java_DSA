 import java.util.*;
class Q35_leetCodeSol10  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[] = new int [3];
		for (int i=0; i<nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		isGoodArray(nums);
		sc.close();
		System.out.println();
	}
	static void isGoodArray(int[] nums) {
        int x=nums[0];
        for (int i=0; i<nums.length; ++i) {
        	x=gcd(x,nums[i]);        	
        }
        if (x==1) {
        	System.out.println("True");        	
        }
        else {
        	System.out.println("False");
        }

        // return x==1; //For leetcode
    }
    static int gcd(int a,int b) {
    	while(b>0) {
    		int temp = b;
    		b = a % b;
    		a = temp;
    	}
    	return a;
    }
}

