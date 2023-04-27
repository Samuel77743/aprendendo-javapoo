package exerciciopoo013.veiculos;

public class Veiculos {
    protected String marca;
    protected float preco;

    public Veiculos(String marca) {
        this.marca = marca;            
    }

    public void info() {
        System.out.printf("MARCA................ %s\n", this.marca);
        System.out.printf("PREÇO................ %.2f\n", this.preco);
    }
}