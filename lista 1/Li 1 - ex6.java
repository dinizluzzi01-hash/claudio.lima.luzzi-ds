import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade < 16)
            System.out.println("Não vota");
        else if (idade < 18 || idade > 70)
            System.out.println("Opcional");
        else
            System.out.println("Obrigatório");
    }
}