import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double p1 = sc.nextDouble();

        double n2 = sc.nextDouble();
        double p2 = sc.nextDouble();

        double n3 = sc.nextDouble();
        double p3 = sc.nextDouble();

        double media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);

        System.out.println(media);
    }
}