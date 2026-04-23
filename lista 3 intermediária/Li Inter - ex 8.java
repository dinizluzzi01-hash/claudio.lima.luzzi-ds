import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segredo = 7;
        int palpite;

        do {
            System.out.print("Digite um número: ");
            palpite = sc.nextInt();

            if (palpite > segredo) System.out.println("Menor!");
            else if (palpite < segredo) System.out.println("Maior!");

        } while (palpite != segredo);

        System.out.println("Acertou!");
    }
}