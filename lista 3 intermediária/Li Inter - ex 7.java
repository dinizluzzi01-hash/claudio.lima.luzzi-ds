import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double total = 0;

        do {
            System.out.println("1 - Arroz (10)");
            System.out.println("2 - Feijão (8)");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: total += 10; break;
                case 2: total += 8; break;
            }

        } while (opcao != 0);

        System.out.println("Total: " + total);
    }
}