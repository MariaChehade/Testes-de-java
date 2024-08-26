public class Personagem {
    public String nome;
    public int poder;


    public Personagem(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public void AumentaNivel() {
        poder = poder + 10;
        System.out.println("Seu nível de poder agora é: " + poder);
    }

    public void mudaNome(Personagem j, String novoNome) {
        j.nome = novoNome;
        System.out.println("O nome do personagem foi alterado de " + nome +", para: " + novoNome);


    
    }


    public static void main(String[] args) {
        Personagem p1 = new Personagem("JAJAJAJA", 1);
        System.out.println(p1);
    }








    
}
