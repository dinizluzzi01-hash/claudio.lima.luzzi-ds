import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        String senha = sc.next();

        if (user.equals("admin") && senha.equals("1234"))
            System.out.println("Acesso permitido");
        else
            System.out.println("Acesso negado");
    }
}