public class Main {
    public static void main(String[] args) {
        String[] produtos = {"Arroz", "Feijão"};
        int[] estoque = {10, 5};

        int opcao = 1;

        switch (opcao) {
            case 1:
                estoque[0] += 5;
                break;
            case 2:
                estoque[1] -= 2;
                break;
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + ": " + estoque[i]);
        }
    }
}