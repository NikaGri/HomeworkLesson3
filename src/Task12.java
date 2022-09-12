public class Task12 {
    public static void main(String[] args) {

        int sum = 0, x = 0, y = 1;
        System.out.print(x + " " + y + " ");
        for (int t = 0; t < 9; t++) {
            sum = x + y;
            x = y;
            y = sum;
            System.out.print(sum + " ");
        }
    }
}