import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum += x;
        System.out.println(sum);
    }
}