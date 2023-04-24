package exerciciopoo004;

public class Jogador {
    private int id = 0;
    private int vidas = 7;
    

    public Jogador(int id) {
        this.id = id;
        System.out.printf("Jogador #%02d\nVidas ==> %d\n\n", id, this.vidas);
    }
    
}
