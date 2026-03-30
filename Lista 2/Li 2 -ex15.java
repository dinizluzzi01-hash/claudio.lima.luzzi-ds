import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = sc.nextDouble();

        if (preco < 50)
            preco *= 0.95;
        else if (preco <= 100)
            preco *= 0.90;
        else
            preco *= 0.85;

        System.out.println(preco);
    }
}