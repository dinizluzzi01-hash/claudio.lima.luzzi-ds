import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor > 100)
            valor *= 0.8;
        else
            valor *= 0.9;

        System.out.println(valor);
    }
}