import java.util.Scanner;
class Q15_strrev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a String :- ");
        String str = in.nextLine();
        String rev = "";
        for(int i=str.length()-1; i>=0; --i) {
            rev = rev + str.charAt(i);
        }
        System.out.printf("Rev = %s",rev);
        System.out.println();
    }
}
