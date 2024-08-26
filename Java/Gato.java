public class Gato {

    String cor, nome;

    Gato(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }
    public static void main(String[] args) {
   

        Gato gato1 = new Gato("Eevee", "Amarrelo");
        
        Gato gato2 = new Gato("Lino", "Mesclado");
      
    
    
        System.out.println(gato1.nome);
        System.out.println(gato1.cor);
        System.out.println(gato2.nome);
        System.out.println(gato2.cor);
        
    }
}
