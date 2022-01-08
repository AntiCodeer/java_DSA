import java.util.Scanner;
class check
{
   public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter Value 1 = ");
        String value1 = scan.nextLine();

        System.out.print("\nEnter Value 2 = ");
        String value2 = scan.nextLine();

        System.out.println(value1.equals(value2));
   }
}
