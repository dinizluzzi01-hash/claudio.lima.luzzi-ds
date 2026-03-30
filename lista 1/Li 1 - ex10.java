import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        char sexo = sc.next().charAt(0);

        if (sexo == 'M')
            System.out.println((72.7 * h) - 58);
        else
            System.out.println((62.1 * h) - 44.7);
    }
}