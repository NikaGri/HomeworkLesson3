import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int n = console.nextInt();

        if (n % 2 == 0) {
            System.out.println("Число четное");}
        else {
            System.out.println("Число нечетное");}
    }

}