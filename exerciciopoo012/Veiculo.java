package exerciciopoo012;

public class Veiculo {
    private String nome;
    private int tipo;

    public Veiculo(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void info() {
        System.out.println("--------------------------");
        System.out.printf("Nome --> %s\nTipo --> %d\n", this.nome, this.tipo);
    }
}
