 import java.util.*;
class Q37_leetCodeSol12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    checkPangram(s);
    sc.close();
    System.out.println(checkPangram(s));
  }
  static boolean checkPangram(String s) {
    boolean []a = new boolean[26];
    for (int i=0; i<s.length(); ++i) {
      a[s.charAt(i)-'a'] = true;
    }
    for (int i=0; i<26; ++i) {
      if (a[i] == false) {
        return false;
      }
    }
    return true;
  }
}
