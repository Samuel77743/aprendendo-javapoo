package exerciciopoo005;    

public class Roupas {

    private int idCompra;
    private String marca;
    private float preco;
    private String size;

    public Roupas( int idCompra, String marca, float preco, String size ) {
        this.idCompra = idCompra;
        this.marca = marca;
        this.preco = preco;
        this.size = size;

        System.out.printf("ID #%d\nMarca: %s\nPreço: %.2f\nTamanho: %s\n\n", idCompra, marca, preco, size);
    }
    
}
