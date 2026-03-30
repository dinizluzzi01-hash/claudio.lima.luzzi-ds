import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > 0 && b > 0)
            System.out.println(a + b);
        else
            System.out.println("Valores inválidos");
    }
}