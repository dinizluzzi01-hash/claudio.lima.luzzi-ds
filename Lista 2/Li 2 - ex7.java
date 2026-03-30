import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        double velocidade = sc.nextDouble();

        double tempo = distancia / velocidade;
        System.out.println(tempo);
    }
}