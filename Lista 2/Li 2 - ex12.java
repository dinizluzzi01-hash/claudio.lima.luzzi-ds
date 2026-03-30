import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double reais = sc.nextDouble();
        double cotacao = sc.nextDouble();

        double dolares = reais / cotacao;
        System.out.println(dolares);
    }
}