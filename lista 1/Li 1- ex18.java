import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kwh = sc.nextDouble();
        double valor;

        if (kwh < 100)
            valor = kwh * 0.20;
        else
            valor = kwh * 0.25;

        System.out.println(valor);
    }
}