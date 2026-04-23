import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String cpf = "123.456.789-00";

        if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            System.out.println("Formato válido");
        } else {
            System.out.println("Formato inválido");
        }
    }
}