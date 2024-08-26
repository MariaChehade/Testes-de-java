public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    long telefone;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, String endereco, long telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;

        System.out.println("Nome:   " + nome);
        System.out.println("Idade:  " + idade);
        System.out.println("Endereço:   " + endereco);
        System.out.println("Telefone:   " + telefone);
    }
    public Pessoa() {
    }
    

    

    


}
