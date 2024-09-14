import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com X: ");
        x = scanner.nextDouble();

        System.out.print("Entre com Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("a distacia da hypotemusa é: " + z);
        scanner.close();
    }
}