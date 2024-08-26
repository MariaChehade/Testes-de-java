public class Array {
    public static void main(String[] args) {
        int[] nomeArray; //estou declarando o array

        /* 
        nomeArray = new int[3]; //estou criando um array
        nomeArray[0] = 5;
        nomeArray[1] = 8;
        nomeArray[2] = 2;
*/

        nomeArray = new int[]{5, 8, 2}; //aqui, cria-se e preenche o array com valores

        /* 
        System.out.println(nomeArray[0]);
        System.out.println(nomeArray[1]);
        System.out.println(nomeArray[2]);
*/

        //alterando elementps
        nomeArray[0] = 10;

        System.out.println("Valor alterado = " + nomeArray[0]);


        //para percorrer o array
        for (int i = 0; i < nomeArray.length; i++)
        System.out.println(nomeArray[i]);

    }
}
