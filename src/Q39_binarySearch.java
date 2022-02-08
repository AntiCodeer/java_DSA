 import java.util.Scanner;

class Q39_binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the No Of Elements :- ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("\nEnter the Array Elements :- ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("\nEnter the Key Value :- ");
        int key = sc.nextInt();
        b_search(a,key,n);
        sc.close();
        System.out.println();
    }

    private static void b_search(int[] a, int key, int n) {
        int first=0,last=n-1, mid=(first+last)/2;
        while (first<=last) {
            if (a[mid]<key) {
                first = mid + 1;
            }
            else if (a[mid]==key) {
                System.out.printf("\n%d Element Found In %d Position.",key,mid+1);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first+last)/2;
        }
        if (first>last) {
            System.out.printf("%d Element Not Found In the array.",key);
        }
        return;
    }
}
