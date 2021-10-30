import java.util.*;
public class Q30_leetCodeSol5 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums[][] = new int [3][2];
		for (int i=0; i<nums.length; ++i) {
			for (int j=0; j<nums[i].length; ++j) {
				nums[i][j] = sc.nextInt();
			}
		}
		maximumWealth(nums);
		sc.close();
		System.out.println();
	}

    static void maximumWealth(int[][] accounts) {
		int total=0,wealth=0;
        for (int i=0; i<accounts.length; ++i) {
        	for (int j=0; j<accounts[i].length; ++j) {
	       		total = total + accounts[i][j];
        	}
	   		if (total>wealth) {
	   			wealth = total;
	   		}
       		total = 0;
        }
	    System.out.printf("\nMax Wealth = %d",wealth);
    }
}
