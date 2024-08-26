public class Aplicacao2 {
    public static void main(String[] args) {
        Livro l1 = new Livro("AmongUs", "Fantasma", 23, 17.50);
        Livro l2 = new Livro();
        Livro l3 = new Livro("Fantasminha Camarada" , "Lagosta");
   
        System.out.println(l1.titulo);
        System.out.println(l1.ano);
        System.out.println(l2.preco);
        System.out.println(l3.titulo);
        System.out.println(l1.getAutor());
        System.out.println();

   
    }
    
}
