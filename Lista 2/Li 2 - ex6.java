import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");

        if (n % 5 == 0)
            System.out.println("Divisível por 5");
        else
            System.out.println("Não divisível por 5");
    }
}