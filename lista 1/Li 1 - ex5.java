import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        if (salario < 2000)
            salario *= 1.10;
        else if (salario <= 4000)
            salario *= 1.07;
        else
            salario *= 1.05;

        System.out.println(salario);
    }
}