import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        double consumo = sc.nextDouble();

        double litros = distancia / consumo;
        System.out.println(litros);
    }
}