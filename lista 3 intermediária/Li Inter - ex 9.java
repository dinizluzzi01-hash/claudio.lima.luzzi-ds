public class Main {

    public static void cadastrar(String nome, int idade) {
        System.out.println("Aluno: " + nome + " | Idade: " + idade);
    }

    public static void main(String[] args) {
        cadastrar("Ana", 20);
        cadastrar("Carlos", 22);
    }
}