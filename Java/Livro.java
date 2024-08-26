public class Livro {
    public String titulo;
    private String autor;
    protected int ano;
    double preco;


    public Livro(String titulo, String autor, int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }
    public Livro(){

    }
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
