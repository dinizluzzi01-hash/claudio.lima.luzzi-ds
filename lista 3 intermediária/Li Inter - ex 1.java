import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 20, 3};
        int soma = 0, maior = nums[0], menor = nums[0];

        for (int n : nums) {
            soma += n;
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        double media = (double) soma / nums.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}