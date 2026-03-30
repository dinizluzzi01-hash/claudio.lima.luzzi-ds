import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();

        int minutos = horas * 60;
        System.out.println(minutos);
    }
}