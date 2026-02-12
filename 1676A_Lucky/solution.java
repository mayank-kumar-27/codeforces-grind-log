import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i < n) {
            int a = sc.nextInt(), first = 0, last = 0, j = 0;
            while (a != 0) {
                if (j < 3) { last += a % 10; j++; } else first += a % 10;
                a /= 10;
            }
            if (first == last) { System.out.println("YES"); } else System.out.println("NO");
        }
        sc.close();
    }
}
