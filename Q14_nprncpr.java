import java.util.Scanner;
class Q14_ncrnpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nEnter the Value of N :- ");
        int n = in.nextInt();
        System.out.print("\nEnter the Value of R :- ");
        int r = in.nextInt();
        int npr = fact(n)/fact(n-r);
        System.out.printf("\n nPr = %d",npr);
        int ncr = npr/fact(r);
        System.out.printf("\n nCr = %d",ncr);        
        System.out.println();
    }
    
    static int fact(int n) {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
        
    
