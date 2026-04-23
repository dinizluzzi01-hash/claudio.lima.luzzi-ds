import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso liberado");
                break;
            }

            tentativas++;
        }

        if (tentativas == 3) {
            System.out.println("Conta bloqueada");
        }
    }
}