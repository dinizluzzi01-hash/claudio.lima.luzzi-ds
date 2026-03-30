import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double desconto;

        if (salario < 2000)
            desconto = salario * 0.08;
        else if (salario <= 3000)
            desconto = salario * 0.09;
        else
            desconto = salario * 0.11;

        System.out.println("Salário líquido: " + (salario - desconto));
    }
}