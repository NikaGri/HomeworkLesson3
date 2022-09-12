import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int n = console.nextInt();

        if (n == 12 || n == 1 || n == 2) {
            System.out.println("Winter");}
        else if (n == 3 || n == 4 || n == 5) {
            System.out.println("Spring");}
        else if (n == 6 || n == 7 || n == 8) {
            System.out.println("Summer");}
        else if (n == 9 || n == 10 || n == 11) {
            System.out.println("Fall");}
    }

}