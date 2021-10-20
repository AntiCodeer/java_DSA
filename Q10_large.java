import java.util.Scanner;
class Q10_large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,large=0;
        do {
            System.out.print("Enter Numbers :- ");
            n = sc.nextInt();
            if(n > large) {
                large = n;
            }
        }while(n!=0);
        System.out.println("Lergest = "+large);
    }
}
