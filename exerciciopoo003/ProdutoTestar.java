/**
 * produto-testar
 */
package exerciciopoo003;

public class ProdutoTestar {
    public static void main(String[] args) {
        int idProduto = 0;

        //Deve-se explicitar que o 3º Parâmetro é um float colocando f no final
        Produto prod1 = new Produto(++idProduto, "Caneta Azul", 4.99f);
        //Supondo que houve uma redução de preço na caneta azul
        prod1.preco = 3.99f;
        System.out.printf("Novo preço --> R$ %.2f\n\n", prod1.preco);

        Produto prod2 = new Produto(++idProduto, "Lápis", 2.49f);
        //Promoção 50% OFF
        prod2.preco = prod2.preco / 2;
        System.out.printf("Novo preço --> R$ %.2f\n\n", prod2.preco);
        
        
    
    }
    
}