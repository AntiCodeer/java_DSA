package src;

import java.util.Scanner;
class Q6_isArmstrong {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a No :- ");
        int n = in.nextInt();
        in.close();
        if (isArm(n)) {
            System.out.println(n+" is an Armstrong No");
        }
        else {
            System.out.println(n+" is Not an Armstrong No");
        }
    }

    static boolean isArm(int n) {
        int rem,sum=0,copy = n;
        
        // int digits=0
        // while (copy!=0) {
        //     ++digits;
        //     copy /= 10;
        // }

        copy = n;
        while (copy!=0) {
            rem = copy % 10;
            sum = sum + rem*rem*rem; 
            // sum = sum + power(digits,rem);  //i can also use power(digits,rem) instead of rem*rem*rem
            copy /= 10;
        }

        if (sum == n) {
            return true;
        }
        else {
            return false;
        }
    }

    static int power(int digits,int rem) {
        int p=1;

        for (int i = 1; i <= digits; i++) {
            p = p * rem;
        }
        return p;
    }
}
