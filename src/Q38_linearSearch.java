import java.util.*;
class Q38_lSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0; i<n; ++i) {
      a[i] = sc.nextInt();
    }
    int key = sc.nextInt();
    search(a,key);
    sc.close();
    System.out.println();
  }
  static void search(int[] a,int key) {
    int count=0;
    for (int i=0; i<a.length; ++i) {
      if (a[i] == key) {
        count++;
        System.out.printf("\n %d Element Found In %d Position.",key,i+1);
      }
    }
    if (count > 0) {
      System.out.printf("\n %d Element Occurs %d Times.",key,count);
    }
    else {
      System.out.printf("\n %d Element Not Found In Array",key);
    }
  }
}
