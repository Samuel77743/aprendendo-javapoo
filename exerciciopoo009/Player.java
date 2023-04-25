package exerciciopoo009;

public class Player {

    private int idPlayer;
    private String nomePlayer;
    private int vidas;

    private final int MAXVIDAS = 7;

    public Player(int idPlayer, String nomePlayer){
        this.idPlayer = idPlayer;
        this.nomePlayer = nomePlayer;
        this.vidas = 4;
    }

    public void setVidas(int vidas){
        if(vidas > this.MAXVIDAS){
            this.vidas = this.MAXVIDAS;
        }
        else if(vidas < 0){
            this.vidas = 0;
        }
        else{
            this.vidas = vidas;
        }
    }

    public String getAll(){
        return ("ID #"+this.idPlayer+"\nNome --> "+this.nomePlayer+"\nVidas --> "+this.vidas);
    }

    public void addVidas(){
        if(this.vidas < this.MAXVIDAS){
            this.vidas++;
        }

    }
    
}
