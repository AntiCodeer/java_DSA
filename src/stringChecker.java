import java.util.Scanner;

class stringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the String :- ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                System.out.println("PureString");
            } else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'A') {
                System.out.println("PureString");
            } else {
                System.out.println("IMPureString");
            }
        }
        System.out.println();
        sc.close();
    }
}
