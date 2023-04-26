package exerciciopoo010;

public class AprendStatic{
    private String player;
    private int vidas;
    private int id;

    static boolean alerta = true;
    static int numJogadores;

    private final int MAXVIDAS = 7;

    public AprendStatic(int id) {
        this.id = id;
        ++numJogadores;
    }

    public void info(){
        System.out.printf("Jogador ID #%d\n", this.id);
        System.out.printf("Vidas --> %d\n", this.vidas);
        System.out.printf("Alerta --> %s\n", alerta ? "Verdadeiro" : "Falso");
        System.out.printf("Número de jogadores --> %d\n\n", numJogadores);
    } 

    public String getPlayer() {
        return this.player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas) {
        if(vidas > MAXVIDAS){
            this.vidas = MAXVIDAS;
        }
        else if(vidas < 0){
            this.vidas = 0;
        }
        else{
            this.vidas = vidas;
        }
    }
}