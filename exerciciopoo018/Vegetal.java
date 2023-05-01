package exerciciopoo018;

public class Vegetal {
    //Atributos
    private boolean vivo;
    private int massa;
    
    //Construtor
    public Vegetal(int massa) {
        this.vivo = true;
        this.massa = massa;
    }
    
    //GETs e SETs
    public int getMassa() {
        return this.massa;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public boolean getVivo() {
        return this.vivo;
    } 

    public void info() {
        System.out.printf("Tipo..........: %s \n", this.getClass().toString());
        System.out.printf("Situação......: %s \n", (this.getVivo() ? "Vivo" : "Morto") );
        System.out.printf("Massa.........: %s \n", this.getMassa() );
    }

}
