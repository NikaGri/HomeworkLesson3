import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер цвета: ");
        int i = console.nextInt();

        switch (i) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
        }

    }

}