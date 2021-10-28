import java.util.Scanner;
class Q13_power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter an Integer No :- ");
        int n = in.nextInt();
        
        System.out.printf("\nEnter the Power of %d You Want :- ",n);
        int p = in.nextInt();
        
        System.out.printf("\nPower = %d", power(n,p));
        System.out.printf("\n");
        System.out.printf("\n");
    }    
    static int power(int n,int p) {
        int power=1;
        for(int i=1; i<=p; ++i){
            power=power*n;
        }
        return power;
    }
}
