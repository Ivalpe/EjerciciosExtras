import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="TRWAGMYFPDXBNJZSQVHLCKE";

        int i = sc.nextInt();
        int r = i%23;

        System.out.println(a.charAt(r));
        sc.close();
    }
}
