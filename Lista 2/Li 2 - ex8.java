import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.3)
            System.out.println("Aprovado");
        else
            System.out.println("Negado");
    }
}