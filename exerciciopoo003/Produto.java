/**
 * Produto
 */
package exerciciopoo003;

public class Produto {

    public int idProduto;
    public String nomeProduto;
    public float preco = 0; 

    public Produto(int idProduto, String nomeProduto, float preco) {
        this.idProduto = idProduto;
        this.preco = preco;
        this.nomeProduto = nomeProduto;

        System.out.printf("ID #%d\nNome: %s\nPreço: R$%.2f\n", idProduto, nomeProduto, preco);


    }
}