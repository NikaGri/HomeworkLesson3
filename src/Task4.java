import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        int t = console.nextInt();

        if (t > -5) {
            System.out.println("Тепло");}
        else if (t <= -5 && t >= -20) {
            System.out.println("Нормально");}
        else if (t <= -20) {
            System.out.println("Холодно");}
    }

}