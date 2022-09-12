import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма вклада: ");
        float a = scanner.nextFloat();

        System.out.println("Количество месяцев: ");
        int b = scanner.nextInt();
        for (int x = 0; x < b; x++)
            a *= 1.07;
        System.out.println("Конечная сумма вклада: " + a);

    }
}
