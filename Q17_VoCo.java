import java.util.Scanner;
class Q17_VoCo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a String :- ");
        String str = in.nextLine();
        int c=0,c1=0,c2=0;
        int len = str.length();
        while(len-1 >= 0) {            

            if(str.charAt(c)=='A' ||str.charAt(c)=='a' ||str.charAt(c)=='E' ||str.charAt(c)=='e' ||str.charAt(c)=='I' ||str.charAt(c)=='i' ||str.charAt(c)=='O' ||str.charAt(c)=='o' ||str.charAt(c)=='U' ||str.charAt(c)=='u') {

                ++c1;
            }
            else{
                ++c2;
            }
            ++c;
            --len;
        }
        System.out.printf("\nVowel = %d",c1);
        System.out.printf("\nConsonent = %d",c2);
        System.out.println();
    }
}
