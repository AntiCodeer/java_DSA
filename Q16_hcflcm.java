import java.util.Scanner;
class Q16_hcflcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("This Program Will Calculate HCF and LCM of A and B.....");
        System.out.print("\nEnter the Value of A :- ");
        int a = in.nextInt();
        System.out.print("\nEnter the Value of B :- ");
        int b = in.nextInt();
        int x = a, y = b;
        while(y!=0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int hcf = x;
        int lcm = (a*b)/hcf;
        System.out.printf("\nHCF = %d",hcf);
        System.out.printf("\nLCM = %d",lcm);
        in.close();
        System.out.println();
    }
}
        
