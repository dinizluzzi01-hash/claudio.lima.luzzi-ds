import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();

        double finalValor = preco * 1.12; // 5% + 7%
        System.out.println(finalValor);
    }
}