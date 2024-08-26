package empresa.dados;
public class Funcionario {
    private String nome;
    double salario;

    private Funcionario(String nomeInt, double salarioInit) {
        nome = nomeInt;
        salario = salarioInit;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public Funcionario() {
        Funcionario func = new Funcionario("Mario", 4000);
        System.out.println(func);
    }


}