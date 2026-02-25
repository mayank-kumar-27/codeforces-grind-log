import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = 0;
            for (int i = 0; i < 4; i++) s += sc.nextInt();
            System.out.println(s % 3 == 0 ? "YES" : "NO");
        }
        sc.close();
    }
}