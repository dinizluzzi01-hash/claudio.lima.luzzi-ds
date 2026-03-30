import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > b)
            System.out.println(a);
        else if (b > a)
            System.out.println(b);
        else
            System.out.println("Iguais");
    }
}