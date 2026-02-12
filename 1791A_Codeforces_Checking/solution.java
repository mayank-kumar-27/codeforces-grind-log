import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = -1;
        while (++i < n) {
            String a = sc.next();
            if (a.equals("c") || a.equals("o") || a.equals("d") || a.equals("e") || a.equals("f") || a.equals("r") || a.equals("s")) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
