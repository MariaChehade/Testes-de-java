public class SalaDeAula {
    private static int alunos = 0; // Variável estática para armazenar o número total de alunos

    public static void adicionarAluno() {
        alunos++;
    }

    public static void mostrarTotalAlunos() {
        System.out.println("Número total de alunos: " + alunos);
    }
}
