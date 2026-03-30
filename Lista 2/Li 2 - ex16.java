import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 10 && n <= 50)
            System.out.println("Dentro do intervalo");
        else
            System.out.println("Fora do intervalo");
    }
}