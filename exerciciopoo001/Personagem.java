package exerciciopoo001;
/**
 * Jogador
 */
public class Personagem {
    
    public String classe;
    public int id;
    public int vida;

    public Personagem(int id, String classe) {
        this.classe = classe;
        this.vida = 7;
        this.id = id;

        System.out.printf("\nID Jogador --> %d\nClasse --> %s\nVidas --> %d\n\n", id, classe, vida);
    }
}