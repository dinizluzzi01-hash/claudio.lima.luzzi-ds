import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Não forma triângulo");
        else if (a == b && b == c)
            System.out.println("Equilátero");
        else if (a == b || a == c || b == c)
            System.out.println("Isósceles");
        else
            System.out.println("Escaleno");
    }
}