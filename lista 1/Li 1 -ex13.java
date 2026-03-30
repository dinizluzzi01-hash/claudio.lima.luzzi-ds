import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10)
            System.out.println("Inválida");
        else
            System.out.println("Válida");
    }
}