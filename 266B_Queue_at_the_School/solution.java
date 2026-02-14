import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        for (int i = 0; i < b; i++) {
            int j = 0;
            while (j < a - 1) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') { arr[j] = 'G'; arr[j + 1] = 'B'; j += 2; }
                else j++;
            }
        }
        System.out.println(new String(arr));
        sc.close();
    }
}
