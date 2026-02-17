import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
            int max = arr[0], min = arr[0];
            for (int i = 1; i < a; i++) { max = max > arr[i] ? max : arr[i]; min = min < arr[i] ? min : arr[i]; }
            System.out.println(max - min);
        }
        sc.close();
    }
}
