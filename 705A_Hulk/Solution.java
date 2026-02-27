import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = "I hate that ", s2 = "I love that ", r = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) r += s1;
            else r += s2;
        }
        int i = r.lastIndexOf(" that ");
        r = r.substring(0, i) + " it";
        System.out.println(r);
        sc.close();
    }
}