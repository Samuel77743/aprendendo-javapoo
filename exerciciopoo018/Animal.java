package exerciciopoo018;

public abstract class Animal implements SerVivo {
    //Atributos
    private boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int forca;
    private int vel;

    //CONSTRUTOR
    public Animal(int massa, int vel, int forca) {
        this.vivo = true;
        this.massa = massa;
        this.vel = vel;
        this.forca = forca;
        this.x = 0;
        this.y = 0;
    }

    // GETs e SETs
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public boolean getVivo() {
        return this.vivo;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getForca() {
        return this.forca;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    public int getMassa() {
        return this.massa;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
    public int getVel() {
        return this.vel;
    }
    
    //AÇÕES
    public void atacar(Animal atacado) {
        if(atacado.getVivo()){

            if(this.forca >= atacado.getForca()) {
                this.forca += atacado.getMassa();
                atacado.setVivo(false); 
            }
            else {
                atacado.forca += this.massa;
                this.setVivo(false);
            }
        }
        else {
            System.out.println("===================================");
            System.out.println(atacado.getClass().toGenericString() + "está morto e não pode atacar");
            System.out.println("===================================");
        }
    }

    public void mover() {
        if(this.getVivo()) {
            this.x += this.vel;
            this.y += this.vel;
        }
        else {
            System.out.println("===================================");
            System.out.println(this.getClass().toGenericString() + "está morto e não pode atacar");
            System.out.println("===================================");
        }
    }
    public void comer(int massa) {

        if(this.vivo) {
            this.forca += massa;
        }
        else {
            System.out.println("===================================");
            System.out.println(this.getClass().toGenericString() + "está morto e não pode atacar");
            System.out.println("===================================");
        }

    }
    public void info() {
        System.out.printf("\nTipo..........: %s \n", this.getClass().toString());
        System.out.printf("Situação......: %s \n", (this.getVivo() ? "Vivo" : "Morto") );
        System.out.printf("Massa.........: %s \n", this.getMassa() );
        System.out.printf("Velocidade....: %s \n", this.getVel() );
        System.out.printf("Força.........: %s \n", this.getForca() );

    }
}