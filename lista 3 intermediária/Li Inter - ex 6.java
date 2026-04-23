import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) pares.add(n);
            else impares.add(n);
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}