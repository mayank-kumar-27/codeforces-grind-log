import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine(), r = "";
            r += s.charAt(0);
            for (int i = 0; i < s.length() - 1; i++) if (s.charAt(i) == ' ') r += s.charAt(i + 1);
            System.out.println(r);
        }
        sc.close();
    }
}