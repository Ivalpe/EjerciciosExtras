import java.util.Scanner;

public class Ej2 {
    public static void main() {
        Scanner lector = new Scanner(System.in);

        int i = lector.nextInt();

        int r = i % 4;

        System.out.println("B? " + (r==0));
    }
}
