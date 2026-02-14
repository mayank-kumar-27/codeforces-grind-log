import java.util.Scanner;
public class solution {
    private static boolean is_prime(int a) {
        if (a < 2) return false;
        for (int i = 2; i * i <= a; i++) if (a % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        for (int i = a + 1; i < b; i++) if (is_prime(i)) { System.out.println("NO"); return; }
        System.out.println(is_prime(b) ? "YES" : "NO");
    }
}