import java.util.Scanner;

class strPalindrome {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter a String or a Number :- ");
        String str = in.nextLine();
        in.close();
        if (isPalindrome(str)) {
            System.out.printf("\n%s is a Palindrome.", str);            
        }
        else {
            System.out.printf("\n%s is Not a Palindrome.", str);
        }
    }

    static boolean isPalindrome(String str) {
        
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (rev.equals(str)) {
            return true;
        }
        else {
            return false;
        }
    }
}
