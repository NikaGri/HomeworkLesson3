import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int n = console.nextInt();

        switch (n) {
            case 12,1,2:
                System.out.println("Winter");
                    break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Fall");
                break;
        }
    }
}