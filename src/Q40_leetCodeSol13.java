package src;
import java.util.Arrays;
import java.util.Scanner;

class Q40_leetCodeSol13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The size of Array :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("\nEnter the Array Elements :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = ",i);
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter target Element :- ");
        int target = sc.nextInt();

        solution(arr,target);
        sc.close();
        System.out.println();
    }

    static void solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] ans = {i,j};
                    System.out.println(Arrays.toString(ans));
                    break;
                }
            }
        }
    }
}
