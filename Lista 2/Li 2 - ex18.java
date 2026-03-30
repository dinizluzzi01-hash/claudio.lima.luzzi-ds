import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}