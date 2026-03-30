import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();
        double freq = sc.nextDouble();

        if (nota >= 7 && freq >= 75)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}