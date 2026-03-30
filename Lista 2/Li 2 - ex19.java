import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String maior = a;

        if (b.length() > maior.length()) maior = b;
        if (c.length() > maior.length()) maior = c;

        System.out.println(maior);
    }
}