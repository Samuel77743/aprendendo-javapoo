package exerciciopoo008;

public class JogosTestar {
    public static void main(String[] args) {
        int id = 0;

        Jogos jogo1 = new Jogos(++id, "Minecraft", 49.90f);

        //Imprimindo preço
        System.out.printf("Preço --> %.2f\n", jogo1.getPreco());
        //Modificando preço
        jogo1.setPreco(32.99f);
        //Imprimindo a alteração do preço
        System.out.printf("Novo preço --> %.2f\n\n", jogo1.getPreco());

        //Alterando nome do jogo
        jogo1.setNome("Mortal Kombat");

        //Imprimindo todos os atributos do objeto
        System.out.println(jogo1.getAll());

        //Alterando todos atributos
        jogo1.setAll(1, "COD MW2", 89.99f);
        System.out.print("\n"+jogo1.getAll());

    }
}
