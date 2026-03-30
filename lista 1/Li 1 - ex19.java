import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double menor = a;

        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println(menor);
    }
}